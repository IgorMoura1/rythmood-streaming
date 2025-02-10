package br.com.rythmood.rythmood_streaming.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Playlist {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "Title cannot be null")
    private String title;

    private String description;

    private String playlistCover;

    @NotNull(message = "Public status cannot be null")
    private Boolean isPublic;

    @NotNull(message = "Collaborative status cannot be null")
    private Boolean isCollaborative;

    private LocalDateTime creationDate;

    public void addSong(Music song) {
        System.out.println("Adding song: " + song.getTitle() + " to the playlist: " + title);
    }

    public void removeSong(Music song) {
        System.out.println("Removing song: " + song.getTitle() + " from the playlist: " + title);
    }

    public String share() {
        String link = "urlhere" + id;
        System.out.println("Sharing playlist: " + title + " with link: " + link);
        return link;
    }
}
