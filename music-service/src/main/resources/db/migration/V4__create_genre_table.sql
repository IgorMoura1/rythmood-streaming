CREATE TABLE genre (
                       id CHAR(36) NOT NULL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       description TEXT NOT NULL,
                       cover_image VARCHAR(255) NOT NULL
);

CREATE TABLE genre_artists (
                               genre_id CHAR(36) NOT NULL,
                               artist_id CHAR(36) NOT NULL,
                               PRIMARY KEY (genre_id, artist_id),
                               FOREIGN KEY (genre_id) REFERENCES genre(id) ON DELETE CASCADE,
                               FOREIGN KEY (artist_id) REFERENCES artist(id) ON DELETE CASCADE
);

CREATE TABLE genre_songs (
                             genre_id CHAR(36) NOT NULL,
                             music_id CHAR(36) NOT NULL,
                             PRIMARY KEY (genre_id, music_id),
                             FOREIGN KEY (genre_id) REFERENCES genre(id) ON DELETE CASCADE,
                             FOREIGN KEY (music_id) REFERENCES music(id) ON DELETE CASCADE
);
