# Write your MySQL query statement below
SELECT p.product_id, IFNULL(ROUND(SUM(price*units)/SUM(units),2),0) as average_price

FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
WHERE (
p.start_date <= u.purchase_date 
AND p.end_date >= u.purchase_date
 ) 
OR u.purchase_date IS NULL
GROUP BY p.product_id 