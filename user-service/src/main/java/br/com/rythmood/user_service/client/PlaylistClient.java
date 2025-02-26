package br.com.rythmood.user_service.client;

import br.rythmood.music_service.model.Playlist;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "music-service", path = "/api/playlists")
public interface PlaylistClient {

    @GetMapping("/{id}")
    Playlist getPlaylistById(@PathVariable UUID id);

    @GetMapping
    List<Playlist> getAllPlaylists();
}