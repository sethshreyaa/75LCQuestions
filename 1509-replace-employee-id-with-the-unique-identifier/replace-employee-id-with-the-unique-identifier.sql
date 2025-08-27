# Write your MySQL query statement below
SELECT unique_id, name
FROM EmployeeUNI
RIGHT OUTER JOIN Employees
    ON EmployeeUNI.id = Employees.id