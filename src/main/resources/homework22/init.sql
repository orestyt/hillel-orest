create table "Homework"
(
    id          serial
        primary key,
    name        text not null,
    description text not null
);

alter table "Homework"
    owner to hillel;

create table "Lesson"
(
    id          serial
        primary key,
    name        text not null,
    updateat    time,
    homework_id integer
        constraint "Lesson_Homework_id_fk"
            references "Homework"
);

alter table "Lesson"
    owner to hillel;

create table "Teacher"
(
    id   serial
        primary key,
    name text
);

alter table "Teacher"
    owner to hillel;

create table "Schedule"
(
    id        serial
        primary key,
    name      text not null,
    updatedat time,
    lessons   integer
        constraint lessons
            references "Lesson",
    teacher   integer
        constraint teacher
            references "Teacher"
);

alter table "Schedule"
    owner to hillel;

