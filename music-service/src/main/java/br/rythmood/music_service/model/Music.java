package br.rythmood.music_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "music")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private UUID id;

    @NotBlank(message = "Title cannot be blank")
    @Size(max = 100, message = "Title cannot be longer than 100 characters")
    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @NotNull(message = "Duration cannot be null")
    @Column(name = "duration", nullable = false)
    private Integer duration;

    @NotBlank(message = "Lyrics cannot be blank")
    @Column(name = "lyrics", columnDefinition = "TEXT", nullable = false)
    private String lyrics;

    @NotNull(message = "Track number cannot be null")
    @Column(name = "track_number", nullable = false)
    private Integer trackNumber;

    @ElementCollection
    @CollectionTable(name = "music_genres", joinColumns = @JoinColumn(name = "music_id"))
    @Column(name = "genre")
    private List<String> genre;

    @NotBlank(message = "Audio URL cannot be blank")
    @Column(name = "url_audio", nullable = false)
    private String urlAudio;

    @NotNull(message = "Explicit flag cannot be null")
    @Column(name = "explicit", nullable = false)
    private Boolean explicit;
}


