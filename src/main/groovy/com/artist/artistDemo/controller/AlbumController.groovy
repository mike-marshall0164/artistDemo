package com.artist.artistDemo.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping


@RestController
class AlbumController {

    @RequestMapping("/")
    String index() {
        "Hello World!"
    }
}
