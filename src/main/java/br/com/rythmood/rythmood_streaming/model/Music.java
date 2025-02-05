package br.com.rythmood.rythmood_streaming.model;

import jakarta.validation.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Music {

    private UUID id;

    @NotBlank(message = "Title cannot be blank")
    @Size(max = 100, message = "Title cannot be longer than 100 characters")
    private String title;

    @NotNull(message = "Duration cannot be null")
    private Integer duration;

    @NotBlank(message = "Lyrics cannot be blank")
    private String lyrics;

    @NotNull(message = "Track number cannot be null")
    private Integer trackNumber;

    @NotNull(message = "Genres cannot be null")
    private List<String> genre;

    @NotBlank(message = "Audio URL cannot be blank")
    private String urlAudio;

    @NotNull(message = "Explicit flag cannot be null")
    private Boolean explicit;

    public void play() {
        System.out.println("Playing the song: " + title);
    }

    public void pause() {
        System.out.println("Pausing the song: " + title);
    }

    public void skip() {
        System.out.println("Skipping to the next song.");
    }

    public void previous() {
        System.out.println("Going back to the previous song.");
    }
}

