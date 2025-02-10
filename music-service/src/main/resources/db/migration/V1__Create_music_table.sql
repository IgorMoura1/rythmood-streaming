CREATE TABLE music (
                       id CHAR(36) NOT NULL PRIMARY KEY,
                       title VARCHAR(100) NOT NULL,
                       duration INT NOT NULL,
                       lyrics TEXT NOT NULL,
                       track_number INT NOT NULL,
                       url_audio VARCHAR(255) NOT NULL,
                       explicit BOOLEAN NOT NULL
);

CREATE TABLE music_genres (
                              music_id CHAR(36) NOT NULL,
                              genre VARCHAR(50) NOT NULL,
                              FOREIGN KEY (music_id) REFERENCES music(id) ON DELETE CASCADE
);