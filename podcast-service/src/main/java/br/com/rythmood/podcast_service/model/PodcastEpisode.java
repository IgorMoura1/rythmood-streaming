package br.com.rythmood.podcast_service.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.UUID;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PodcastEpisode {

    private UUID id;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "Description cannot be blank")
    private String description;

    @NotNull(message = "Duration cannot be null")
    private Integer duration;

    @NotNull(message = "Publication date cannot be null")
    private LocalDateTime publicationDate;

    @NotBlank(message = "Audio URL cannot be blank")
    private String urlAudio;

    @NotNull(message = "Episode number cannot be null")
    private Integer episodeNumber;

    public void play() {
        System.out.println("Playing episode: " + title);
    }

    public void download() {
        System.out.println("Downloading episode: " + title);
    }
}
