CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare m int;
IF N > 1 THEN
set m = N-1;
END IF;
RETURN (
           select ifnull((
                             select distinct salary from employee order by salary desc limit 1 offset m)
                      , null)
       );
END;