package br.com.rythmood.playback_service.dto;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicDTO {
    private UUID id;
    private String title;
    private Integer duration;
    private String lyrics;
    private Integer trackNumber;
    private List<String> genre;
    private String urlAudio;
    private Boolean explicit;
}
