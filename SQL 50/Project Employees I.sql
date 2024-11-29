SELECT project.project_id, ROUND(AVG(employee.experience_years),2) average_years 
FROM project
JOIN employee
ON project.employee_id = employee.employee_id
GROUP BY project.project_id
