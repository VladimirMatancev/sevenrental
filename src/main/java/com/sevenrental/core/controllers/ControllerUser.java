package com.sevenrental.core.controllers;

import com.sevenrental.core.models.users.ModelUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/users")
public class ControllerUser {
    private List<ModelUser> ListUsers = Stream.of(
            new ModelUser(1L, "Ivan",   "Ivanov"),
            new ModelUser(2L, "Sergey", "Sergeev"),
            new ModelUser(3L, "Anna",   "Annova")
    ).collect(Collectors.toList());

    @GetMapping
    @PreAuthorize("hasAuthority('users:read')")
    public List<ModelUser> getAll(){
        return ListUsers;
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('users:read')")
    public ModelUser getById(@PathVariable Long id){
        return ListUsers.stream().filter(user -> user.getId().equals(id))
                .findFirst().orElse(null);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('users:write')")
    public ModelUser create(@RequestBody ModelUser modelUser){
        this.ListUsers.add(modelUser);
        return modelUser;
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('users:write')")
    public void deleteById(@PathVariable Long id){
        this.ListUsers.removeIf(modelUser -> modelUser.getId().equals(id));
    }
}
