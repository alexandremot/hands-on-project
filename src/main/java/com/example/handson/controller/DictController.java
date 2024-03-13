package com.example.handson.controller;

import com.example.handson.entity.Dict;
import com.example.handson.repository.DictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private DictRepository dictRepository;
    @GetMapping("/{dictKey}")
    public Dict getDictKey(@PathVariable("dictKey") String dictKey){
        return dictRepository.getKeyById(dictKey);
    }
}
