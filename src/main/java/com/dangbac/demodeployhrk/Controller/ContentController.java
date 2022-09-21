package com.dangbac.demodeployhrk.Controller;


import com.dangbac.demodeployhrk.Entity.Content;
import com.dangbac.demodeployhrk.Repo.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {
    @Autowired
    ContentRepository contentRepository;

    @GetMapping("/home")
    public List<Content> getContent(){
        return contentRepository.findAll();
    }
}
