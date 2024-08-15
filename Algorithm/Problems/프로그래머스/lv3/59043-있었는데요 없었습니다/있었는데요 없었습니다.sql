SELECT
    outs.animal_id,
    outs.name
FROM
    animal_outs AS outs
JOIN
    animal_ins AS ins ON outs.animal_id = ins.animal_id
WHERE
    outs.datetime < ins.datetime
ORDER BY
    ins.datetime;