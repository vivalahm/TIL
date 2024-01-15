package com.vivalahm.springbootadminpage.controller;

import org.springframework.web.bind.annotation.GetMapping;

/*
 * packageName : springbootadminpage.controller
 * fileName : BoardController.java
 * author : hmchoi
 * date : 2024-01-15
 * description : 게시판 컨트롤러
 *====================================================================================================
 * DATE			    AUTHOR			NOTE
 * ---------------------------------------------------------------------------------------------------
 * 2024-01-15		hmchoi			최초 생성
 * */
public class BoardController {

    @GetMapping("/")
    public String list() {
        return "board/list";
    }

    @GetMapping("/write")
    public String write() {
        return "board/write";
    }

    @GetMapping("/update")
    public String update() {
        return "board/update";
    }
}
