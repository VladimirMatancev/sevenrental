package com.sevenrental.core.controllers;

import com.sevenrental.core.models.ModelUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<ModelUser> getAll(){
        return ListUsers;
    }
    @GetMapping("/{id}")
    public ModelUser getById(@PathVariable Long id){
        return ListUsers.stream().filter(user -> user.getId().equals(id))
                .findFirst().orElse(null);
    }
}
