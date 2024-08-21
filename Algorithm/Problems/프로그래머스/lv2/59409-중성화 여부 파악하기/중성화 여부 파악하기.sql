SELECT
    animal_id,
    name,
    CASE 
        WHEN SUBSTRING_INDEX(sex_upon_intake, ' ', 1) = 'Intact' THEN 'X'
        ELSE 'O'
    END AS intact_status
FROM
    animal_ins
ORDER BY
    animal_id;