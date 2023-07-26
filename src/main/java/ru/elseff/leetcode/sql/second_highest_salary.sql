select max(salary) from employee where salary < (select max(salary) from employee);
