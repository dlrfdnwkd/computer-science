SELECT
    DISTINCT(d.id),
    d.email,
    d.first_name,
    d.last_name
FROM
    developers AS d
JOIN
    skillcodes AS s ON s.code & d.skill_code
WHERE
    s.name = 'C#'
    OR s.name = 'Python'
ORDER BY
    d.id;