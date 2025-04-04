package br.com.rythmood.user_service.model;

import br.com.rythmood.playback_service.model.PlaybackQueue;
import br.com.rythmood.playback_service.model.Reproduction;
import br.rythmood.music_service.model.Playlist;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String email;
    private String passwork;
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private PlanType planType;

    @Enumerated(EnumType.STRING)
    private SubscriptionStatus subscriptionStatus;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Playlist> playlists = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reproduction> reproductions = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PlaybackQueue playbackQueue;
}