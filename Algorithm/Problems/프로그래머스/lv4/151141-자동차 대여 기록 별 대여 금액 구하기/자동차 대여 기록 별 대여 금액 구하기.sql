SELECT h.history_id, 
    case
        when datediff(h.end_date,h.start_date) + 1 >= 90
        then floor(c.daily_fee * (100 - (select discount_rate from car_rental_company_discount_plan where car_type = "트럭"  order by 1 desc limit 1)) / 100 * (datediff(h.end_date,h.start_date) + 1))
        when datediff(h.end_date,h.start_date) + 1 >= 30
        then floor(c.daily_fee * (100 - (select discount_rate from car_rental_company_discount_plan where car_type = "트럭" order by 1 limit 1 offset 1)) / 100 * (datediff(h.end_date,h.start_date) + 1))
        when datediff(h.end_date,h.start_date) + 1 >= 7
        then floor(c.daily_fee * (100 - (select discount_rate from car_rental_company_discount_plan where car_type = "트럭" order by 1 limit 1)) / 100 * (datediff(h.end_date,h.start_date) + 1))
        else floor(c.daily_fee * (datediff(h.end_date,h.start_date) + 1))
    end as fee
from car_rental_company_rental_history h
join car_rental_company_car c
on c.car_id = h.car_id
where c.car_type = "트럭"
order by 2 desc, 1 desc;