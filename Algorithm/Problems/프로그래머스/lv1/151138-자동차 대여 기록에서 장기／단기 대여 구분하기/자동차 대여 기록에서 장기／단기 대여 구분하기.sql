SELECT
    history_id
    , car_id
    , DATE_FORMAT(start_date, '%Y-%m-%d') AS start_date
    , DATE_FORMAT(end_date, '%Y-%m-%d') AS end_date
    , if(DATE_ADD(start_date, INTERVAL 29 DAY) <= end_date, '장기 대여', '단기 대여') AS rent_type
FROM car_rental_company_rental_history
WHERE start_date LIKE '2022-09-%'
ORDER BY history_id DESC;