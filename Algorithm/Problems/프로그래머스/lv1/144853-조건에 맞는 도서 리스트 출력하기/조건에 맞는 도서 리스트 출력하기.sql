SELECT
    b.BOOK_ID
    , date_format(b.PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
FROM
    BOOK b
WHERE
    date_format(b.PUBLISHED_DATE, '%Y') = '2021'
    and b.CATEGORY = '인문'
ORDER BY
    b.PUBLISHED_DATE;