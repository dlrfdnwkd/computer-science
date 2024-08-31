SELECT DISTINCT 
    a.cart_id 
FROM 
    cart_products a
JOIN 
    cart_products b 
ON 
    a.cart_id = b.cart_id 
WHERE 
    a.name = 'Milk' 
AND 
    b.name = 'Yogurt' 
ORDER BY 
    a.id;