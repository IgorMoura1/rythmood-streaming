package br.com.rythmood.rythmood_streaming.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Album {

    private UUID id;

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @Min(value = 1900, message = "Release year must be greater than or equal to 1900")
    private Integer releaseYear;

    private String albumCover;

    @NotNull(message = "Album type cannot be null")
    private AlbumType type;

    @Min(value = 0, message = "Total duration must be positive")
    private Integer totalDuration;

    private List<Music> trackList = new ArrayList<>();

    public void addMusic(Music music) {
        trackList.add(music);
        totalDuration += music.getDuration();
        System.out.println("Added song: " + music.getTitle() + " to album: " + title);
    }

    public void removeMusic(Music music) {
        if (trackList.remove(music)) {
            totalDuration -= music.getDuration();
            System.out.println("Removed song: " + music.getTitle() + " from album: " + title);
        } else {
            System.out.println("Song not found in the album.");
        }
    }

    public void updateInfo(String newTitle, String newCover, AlbumType newType) {
        this.title = newTitle;
        this.albumCover = newCover;
        this.type = newType;
        System.out.println("Updated album info for: " + title);
    }
}

