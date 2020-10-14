package com.artist.artistDemo.repository

import org.springframework.data.repository.CrudRepository
import com.artist.artistDemo.model.Album


interface AlbumRepository extends CrudRepository<Album, Long> {
    
}