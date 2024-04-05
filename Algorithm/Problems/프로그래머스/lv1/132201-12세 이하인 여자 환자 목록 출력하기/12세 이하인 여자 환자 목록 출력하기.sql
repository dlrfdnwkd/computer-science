SELECT
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    ifnull(TLNO, 'NONE') as TLNO
FROM
    PATIENT
WHERE
    AGE <= 12
    and
    GEND_CD = 'W'
ORDER BY 
    AGE desc, 
    PT_NAME;