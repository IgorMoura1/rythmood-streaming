package br.com.rythmood.playback_service.client;

import br.com.rythmood.playback_service.dto.MusicDTO;
import org.hibernate.validator.constraints.UUID;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "music-service", url = "http://music-service/api/musics")
public interface MusicClient {

    @GetMapping("/{id}")
    MusicDTO getMusicById(@PathVariable UUID id);
}

