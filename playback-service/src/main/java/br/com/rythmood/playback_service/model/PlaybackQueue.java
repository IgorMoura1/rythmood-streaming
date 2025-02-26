package br.com.rythmood.playback_service.model;

import br.com.rythmood.playback_service.dto.MusicDTO;
import lombok.*;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlaybackQueue {

    private UUID id;
    private List<MusicDTO> musicsQueue;
    private Boolean randomMode;
    private RepeatMode repeatMode;

    public PlaybackQueue(UUID id, Boolean randomMode, RepeatMode repeatMode) {
        this.id = id;
        this.musicsQueue = new LinkedList<>();
        this.randomMode = randomMode;
        this.repeatMode = repeatMode;
    }

    public void addMusic(MusicDTO music) {
        this.musicsQueue.add(music);
    }

    public void removeMusic(MusicDTO music) {
        this.musicsQueue.remove(music);
    }

    public MusicDTO nextMusic() {
        if (!musicsQueue.isEmpty()) {
            return musicsQueue.get(0);
        }
        return null;
    }

    public MusicDTO previewMusic() {
        if (!musicsQueue.isEmpty()) {
            return musicsQueue.get(musicsQueue.size() - 1);
        }
        return null;
    }
}
