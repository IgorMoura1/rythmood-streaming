package br.com.rythmood.rythmood_streaming.model;

import lombok.*;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlaybackQueue {

    private UUID id;
    private List<Music> musicsQueue;
    private Boolean randomMode;
    private RepeatMode repeatMode;


    public PlaybackQueue(UUID id, Boolean randomMode, RepeatMode repeatMode) {
        this.id = id;
        this.musicsQueue = new LinkedList<>();
        this.randomMode = randomMode;
        this.repeatMode = repeatMode;
    }

    public void addMusic(Music music) {
        this.musicsQueue.add(music);
    }

    public void removeMusic(Music music) {
        this.musicsQueue.remove(music);
    }

    public Music nextMusic() {
        if (!musicsQueue.isEmpty()) {
            return musicsQueue.get(0);
        }
        return null;
    }

    public Music previewMusic() {
        if (!musicsQueue.isEmpty()) {
            return musicsQueue.get(musicsQueue.size() - 1);
        }
        return null;
    }

}

