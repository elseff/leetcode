-- select department,name as Employee,  salary as Salary
-- from (select d.id, d.name as Department, max(salary) as max
--       from employee e
--                join department d on e.departmentid = d.id
--       group by d.id, d.name) as sel
--          join employee on sel.id = employee.departmentid and sel.max=employee.salary;

select d.name as department, e.name as Employee, e.salary as salary
from employee e
         join department d on e.departmentid = d.id
where (departmentid, salary) in
      (select departmentid, max(salary) from employee e group by departmentid);
