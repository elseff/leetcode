select distinct s.name as name

from salesperson s
         left join orders o on s.sales_id = o.sales_id
         left join company c on o.com_id = c.com_id
where (order_id is null)
   or s.sales_id not in (select distinct o.sales_id as id
                                   from orders o
                                            left join company c on o.com_id = c.com_id
                                   where c.name = 'RED')