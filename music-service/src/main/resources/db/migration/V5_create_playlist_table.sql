CREATE TABLE playlist (
                          id CHAR(36) NOT NULL PRIMARY KEY,
                          title VARCHAR(100) NOT NULL,
                          description TEXT,
                          playlist_cover VARCHAR(255),
                          is_public BOOLEAN NOT NULL,
                          is_collaborative BOOLEAN NOT NULL,
                          creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE playlist_songs (
                                playlist_id CHAR(36) NOT NULL,
                                music_id CHAR(36) NOT NULL,
                                PRIMARY KEY (playlist_id, music_id),
                                FOREIGN KEY (playlist_id) REFERENCES playlist(id) ON DELETE CASCADE,
                                FOREIGN KEY (music_id) REFERENCES music(id) ON DELETE CASCADE
);
