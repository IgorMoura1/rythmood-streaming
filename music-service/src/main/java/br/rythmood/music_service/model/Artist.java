package br.rythmood.music_service.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Artist {

    private UUID id; // Unique identifier for the artist

    @NotBlank(message = "Name cannot be empty")
    private String name; // Artist's name

    private String biography; // Artist's biography

    private String profileImage; // URL or path to profile image

    @NotNull(message = "Verification status cannot be null")
    private Boolean verified; // Whether the artist is verified

    @Positive(message = "Followers count must be positive")
    private Integer followers; // Number of followers

    public void releaseAlbum(Album album) {
        System.out.println(name + " is releasing a new album: " + album.getTitle());
    }

    public void manageProfile(String newBiography, String newProfileImage) {
        this.biography = newBiography;
        this.profileImage = newProfileImage;
        System.out.println(name + " updated their profile.");
    }

    public void viewStatistics() {
        System.out.println("Statistics for " + name + ": Followers - " + followers);
    }
}

