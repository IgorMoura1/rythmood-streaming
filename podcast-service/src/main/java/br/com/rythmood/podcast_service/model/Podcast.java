package br.com.rythmood.podcast_service.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Podcast {

    private UUID id;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 100, message = "Name cannot be longer than 100 characters")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    private String description;

    @NotBlank(message = "Author cannot be blank")
    private String author;

    @NotBlank(message = "Category cannot be blank")
    private String category;

    @NotBlank(message = "Cover image URL cannot be blank")
    private String coverImage;

    public void addEpisode() {
    }

    public void updateInformation() {
    }
}

