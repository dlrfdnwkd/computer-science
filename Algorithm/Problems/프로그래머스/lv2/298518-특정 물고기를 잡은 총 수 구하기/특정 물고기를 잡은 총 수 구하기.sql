SELECT
    COUNT(fi.id) AS "fish_count"
FROM
    fish_info fi
JOIN
    fish_name_info fni ON fni.fish_type = fi.fish_type
WHERE
    fni.fish_name IN ('BASS', 'SNAPPER');