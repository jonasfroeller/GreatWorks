/*
 CREATE TABLE artist (
    id BIGINT NOT NULL,
    name VARCHAR(50) NOT NULL,
    year_born INTEGER NOT NULL,
    year_died INTEGER NOT NULL,
    CONSTRAINT pk_artist PRIMARY KEY (id)
);

CREATE TABLE great_work (
    id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    name VARCHAR(50) NOT NULL,
    year_finished INTEGER NOT NULL,
    work_type VARCHAR(50) NOT NULL,
    medium VARCHAR(50),
    pages INTEGER,
    artist_id BIGINT NOT NULL,
    CONSTRAINT pk_great_work PRIMARY KEY (id),
    CONSTRAINT fk_great_work_artist FOREIGN KEY (artist_id) REFERENCES artist(id)
);

INSERT INTO artist(id, name, year_born, year_died) VALUES (1, 'Michelangelo', 1475, 1564);
INSERT INTO artist(id, name, year_born, year_died) VALUES (2, 'Johann Wolfgang von Goethe', 1749, 1832);
INSERT INTO artist(id, name, year_born, year_died) VALUES (3, 'Pablo Picasso', 1881, 1973);
INSERT INTO artist(id, name, year_born, year_died) VALUES (4, 'Vincent van Gogh', 1853, 1890);
INSERT INTO artist(id, name, year_born, year_died) VALUES (5, 'Klemens Brosch', 1894, 1926);
INSERT INTO artist(id, name, year_born, year_died) VALUES (6, 'George Orwell', 1903, 1950);
INSERT INTO artist(id, name, year_born, year_died) VALUES (7, 'Aldous Huxley', 1894, 1963);
INSERT INTO artist(id, name, year_born, year_died) VALUES (8, 'Leonardo da Vinci', 1452, 1519);

INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('David', 1504, 'Visual', 'Marble', null, 1);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('The Creation of Adam', 1512, 'Visual', 'Fresco', null, 1);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Die Leiden des jungen Werthers', 1774, 'Literature', null, 165, 2);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Faust', 1808, 'Literature', null, 136, 2);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Guernica', 1937, 'Visual', 'Oil', null, 3);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Les Demoiselles d Avignon', 1907, 'Visual', 'Oil', null, 3);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Woman with Green Hat', 1947, 'Visual', 'Oil', null, 3);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('The Starry Night', 1889, 'Visual', 'Oil', null, 4);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('The Potato Eaters', 1885, 'Visual', 'Oil', null, 4);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Self-Portrait', 1889, 'Visual', 'Oil', null, 4);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Das Krokodil auf der Mondscheibe', 1911, 'Visual', 'Ink', null, 5);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Animal Farm', 1945, 'Literature', null, 132, 6);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Nineteen Eighty-Four', 1949, 'Literature', null, 328, 6);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Brave New World', 1931, 'Literature', null, 311, 7);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('Mona Lisa', 1503, 'Visual', 'Oil', null, 8);
INSERT INTO great_work(name, year_finished, work_type, medium, pages, artist_id) VALUES ('The Last Supper', 1498, 'Visual', 'Fresco', null, 8);
*/