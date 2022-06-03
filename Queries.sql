select * from Cinefy.cinefy_movie_domain;

create table cinefy_movie_domain
(
    movie_id     bigint auto_increment
        primary key,
    city_id      int          not null,
    movie_name   varchar(255) null,
    movie_rating int          not null,
    posterurl    varchar(255) null
);


/* INSERT QUERY NO: 1 */
INSERT INTO Cinefy.cinefy_movie_domain VALUES(2,2, 'Top Gun: Maverick', 9, '"Action, Adventure"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(3,2,'The Bob\'s Burgers Movie', 8, '"Comedy,Musical"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(4,2, 'Doctor Strange in the Multiverse of Madness', 7, '"Action,Adventure"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(5,1, 'Everything Everywhere All at Once',8, '"Sci-fi,Adventure"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(6,2, 'The Bad Guys',7, '"Comedy,Adventure"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(7,1, 'Fantastic Beasts: The Secrets of Dumbledore',6, '"Fantasy,Adventure"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(8,2, 'Watcher', 6, '"Thriller,Drama"');
INSERT INTO Cinefy.cinefy_movie_domain VALUES(9,1, 'Sonic the Hedgehog 2', 6, '" Adventure,Comedy"');
