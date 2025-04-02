package br.com.rythmood.playback_service.model;

import br.com.rythmood.audio_service.model.AudioQuality;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reproduction {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "Timestamp cannot be null")
    private LocalDateTime timestamp;

    private Integer duration;

    @NotNull(message = "Device cannot be null")
    private String deviceReproduction;
    @NotNull(message = "Audio quality cannot be null")
    private AudioQuality audioQuality;

    public void registerReproducao() {
        System.out.println("Playback registered on " + timestamp + " with audio quality: " + audioQuality);
    }

    public void updateProgress(Integer progresso) {
        System.out.println("Playback progress updated: " + progresso + " seconds.");
    }
}