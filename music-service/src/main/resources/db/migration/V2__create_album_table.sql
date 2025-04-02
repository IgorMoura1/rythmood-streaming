CREATE TABLE album (
                       id CHAR(36) NOT NULL PRIMARY KEY,
                       title VARCHAR(100) NOT NULL,
                       release_year INT CHECK (release_year >= 1900),
                       album_cover VARCHAR(255),
                       type VARCHAR(50) NOT NULL,
                       total_duration INT CHECK (total_duration >= 0) DEFAULT 0
);

CREATE TABLE album_tracks (
                              album_id CHAR(36) NOT NULL,
                              music_id CHAR(36) NOT NULL,
                              track_number INT NOT NULL,
                              FOREIGN KEY (album_id) REFERENCES album(id) ON DELETE CASCADE,
                              FOREIGN KEY (music_id) REFERENCES music(id) ON DELETE CASCADE,
                              PRIMARY KEY (album_id, track_number)
);
