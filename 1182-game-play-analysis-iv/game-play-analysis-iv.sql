# Write your MySQL query statement below

SELECT ROUND(SUM(if(datediff(a.event_date, temp.day1)=1,1,0))/ COUNT(distinct a.player_id),2) as fraction
FROM
(SELECT player_id, min(event_date) as day1
FROM Activity 
GROUP BY player_id) as temp
JOIN Activity a
    ON temp.player_id = a.player_id