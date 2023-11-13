create table heroes
(
    "Name"       text,
    "Gender"     text,
    "Eye color"  text,
    "Race"       text,
    "Hair color" text,
    "Height"     integer,
    "Publisher"  text,
    "Skin color" text,
    "Alignment"  text,
    "Weight"     integer
);

alter table heroes
    owner to hillel;

COPY heroes
FROM 'C:\Users\orest\IdeaProjects\hillel-orest\heroes.csv'
WITH (format csv, delimiter ';', header );

SELECT AVG("Height") AS average_height FROM heroes;

SELECT * FROM heroes
ORDER BY "Height" DESC
LIMIT 1;

SELECT * FROM heroes
ORDER BY "Weight" DESC
LIMIT 1;

SELECT "Gender", COUNT(*) AS gender_count
FROM heroes
GROUP BY "Gender";

SELECT "Alignment", COUNT(*) AS alingnment_count
FROM heroes
GROUP BY "Alignment";

SELECT "Publisher", COUNT(*) AS publisher_count
FROM heroes
GROUP BY "Publisher"
ORDER BY publisher_count DESC
LIMIT 5;

SELECT "Hair color", COUNT(*) AS hair_color_count
FROM heroes
GROUP BY "Hair color", "Hair color"
ORDER BY hair_color_count DESC
LIMIT 3;

SELECT "Eye color", COUNT(*) AS eye_color_count
FROM heroes
GROUP BY "Eye color", "Eye color"
ORDER BY eye_color_count DESC
LIMIT 1;