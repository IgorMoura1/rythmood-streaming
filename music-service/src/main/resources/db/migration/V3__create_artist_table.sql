CREATE TABLE artist (
                        id CHAR(36) NOT NULL PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        biography TEXT,
                        profile_image VARCHAR(255),
                        verified BOOLEAN NOT NULL,
                        followers INT CHECK (followers >= 0) DEFAULT 0
);

CREATE TABLE artist_albums (
                               artist_id CHAR(36) NOT NULL,
                               album_id CHAR(36) NOT NULL,
                               PRIMARY KEY (artist_id, album_id),
                               FOREIGN KEY (artist_id) REFERENCES artist(id) ON DELETE CASCADE,
                               FOREIGN KEY (album_id) REFERENCES album(id) ON DELETE CASCADE
);
