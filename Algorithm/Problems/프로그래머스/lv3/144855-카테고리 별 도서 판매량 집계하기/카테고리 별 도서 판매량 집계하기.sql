SELECT
    b.category,
    SUM(bs.sales) AS total_sales
FROM
    book b
JOIN book_sales bs ON bs.book_id = b.book_id AND YEAR(bs.sales_date) = 2022 AND MONTH(bs.sales_date) = 1
GROUP BY
    b.category
ORDER BY
    b.category;