package br.rythmood.music_service.model;

import jakarta.validation.constraints.NotBlank;
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
public class Genre {

    private UUID id;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 100, message = "Name cannot be longer than 100 characters")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    private String description;

    @NotBlank(message = "Cover image URL cannot be blank")
    private String coverImage;

    public List<String> listArtists() {
        return List.of();
    }

    public List<String> listSongs() {
        return List.of();
    }
}

