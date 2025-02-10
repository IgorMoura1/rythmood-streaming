package br.rythmood.music_service.service;

import br.rythmood.music_service.model.Music;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MusicService {

    private final List<Music> musicRepository = new ArrayList<>();

    public List<Music> getAllMusic() {
        return new ArrayList<>(musicRepository);
    }

    public Optional<Music> getMusicById(UUID id) {
        return musicRepository.stream().filter(music -> music.getId().equals(id)).findFirst();
    }

    public Music addMusic(Music music) {
        music.setId(UUID.randomUUID());
        musicRepository.add(music);
        return music;
    }

    public Optional<Music> updateMusic(UUID id, Music updatedMusic) {
        return getMusicById(id).map(music -> {
            music.setTitle(updatedMusic.getTitle());
            music.setDuration(updatedMusic.getDuration());
            music.setLyrics(updatedMusic.getLyrics());
            music.setTrackNumber(updatedMusic.getTrackNumber());
            music.setGenre(updatedMusic.getGenre());
            music.setUrlAudio(updatedMusic.getUrlAudio());
            music.setExplicit(updatedMusic.getExplicit());
            return music;
        });
    }

    public boolean deleteMusic(UUID id) {
        return musicRepository.removeIf(music -> music.getId().equals(id));
    }
}