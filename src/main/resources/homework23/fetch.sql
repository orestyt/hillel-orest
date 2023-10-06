select * from "Homework";

select * from "Lesson"
                  LEFT JOIN "Homework" H on H.id = "Lesson".homework_id;

select * from "Lesson"
                  LEFT JOIN "Homework" H on H.id = "Lesson".homework_id
GROUP BY updateat, "Lesson".id, "Lesson".name, homework_id, H.id, H.name, description;

select * from "Schedule"
                  LEFT JOIN "Lesson" L on L.id = "Schedule".lessons;

select name, count("lessons") from "Schedule"
GROUP BY name