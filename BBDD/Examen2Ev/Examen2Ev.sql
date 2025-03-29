-- 1
select avg(sub.total_2009) as pago_medio
from (select p2.total as total_2009
	from pago p2 
	where year(fecha_pago) = '2009'
    ) as sub ;

-- 2
select p.nombre
from producto p
where p.codigo_producto not in(select distinct p.codigo_producto
	from producto p join detalle_pedido dp on p.codigo_producto = dp.codigo_producto
	)
order by nombre;


-- 3
select sum(sub.codigo) as numero_clientes, sub.ciudad
from (select c.codigo_cliente as codigo, c.ciudad as ciudad
from cliente c
where c.ciudad is not null
) as sub
group by sub.ciudad
order by numero_clientes desc
limit 1
;

SELECT ciudad, COUNT(codigo_cliente) AS numero_clientes
FROM cliente
GROUP BY ciudad
ORDER BY numero_clientes DESC
LIMIT 1;

-- 4

select count(c.codigo_cliente) as numero_clientes, c.ciudad
from cliente c
where c.ciudad regexp '^M'
group by c.ciudad
order by numero_clientes, c.ciudad
;

-- 5

select e.nombre, e.apellido1, e.apellido2, c.nombre_cliente
from empleado e left join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado
where c.codigo_cliente in (select c.codigo_cliente
from cliente c
where c.ciudad != 'Madrid'
) or c.codigo_cliente is null
order by e.apellido1, e.nombre
; 

-- 6
select e.nombre, e.apellido1, e.apellido2
from empleado e 
where e.codigo_jefe = (select e2.codigo_empleado
	from empleado e2
	where e2.nombre = 'Alberto' and e2.apellido1 = 'Soria'
    )
order by e.email	;