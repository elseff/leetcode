delete from person where email = (select ec.email from
(select person.email, count(person.email) from person group by person.email having count(email)>1) as ec);