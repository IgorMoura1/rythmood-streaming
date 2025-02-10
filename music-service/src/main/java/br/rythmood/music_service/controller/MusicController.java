package br.rythmood.music_service.controller;

import br.rythmood.music_service.model.Music;
import br.rythmood.music_service.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public List<Music> getAllMusic() {
        return musicService.getAllMusic();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Music> getMusicById(@PathVariable UUID id) {
        Optional<Music> music = musicService.getMusicById(id);
        return music.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Music addMusic(@RequestBody Music music) {
        return musicService.addMusic(music);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Music> updateMusic(@PathVariable UUID id, @RequestBody Music updatedMusic) {
        Optional<Music> music = musicService.updateMusic(id, updatedMusic);
        return music.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusic(@PathVariable UUID id) {
        boolean deleted = musicService.deleteMusic(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
