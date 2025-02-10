package br.rythmood.music_service.repository;

import br.rythmood.music_service.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MusicRepository extends JpaRepository<Music, UUID> {
}
