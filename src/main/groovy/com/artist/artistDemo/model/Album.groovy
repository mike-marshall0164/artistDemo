package com.artist.artistDemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull


@Entity
@Table(name = 'albums')
class Album {

    @Id
    @GeneratedValue
    private final long id

    @NotNull
    String title

    @NotNull
    String artist

    @NotNull
    String genre

    @NotNull
    Date release

}
