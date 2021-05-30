
--Para insertar un proveedor-------------------------------------


--Estado
insert into Estados values (1, 'Michoacán', 'Mich', 'A')

--Ciudades
insert into Ciudades values (1, 'Zamora', 1, 'A')

--Proveedores
insert into Proveedores values ('José Angel', '351-182-0908', 'joseangel455@gmail.com', '20 de Noviembre #1098', '20 de Noviembre', '59600', 'A', 1)

delete proveedores where idProveedor = 0

select * from Proveedores
--Para insertar una sucursal------------------------------------


--Sucursales
insert into Sucursales values ('Numero 1', '351-009-1827', 'Plaza Ana', 'Plaza Ana', '59700', 100000, 'A', 1)


select * from Sucursales

--Para insertar Empleados----------------------------------------

select * from Empleados



--Para insertar Pedidos--------------------------------------------

insert into Pedidos values ('nombre', '2021-05-29', '', 0, 0, 'P', 3, 1, 1)

select * from Pedidos




--Para insertar Presentación--------------------------------------
--1
insert into PresentacionesProducto values ('Polvo', 109, 129, 10, 1, 2, 'A')
select * from PresentacionesProducto

--Producto
--1
insert into Productos values ('Salvo', 'Jabón para trastes', 'Cloro', 'Cloro', 'Polvo', 'Uso en polvo', 'A', 1, 1)
select * from Productos 

	--Laboratorio
	--1
	insert into Laboratorios values ('Lab1', 'Zamora', 'A')
	select * from Laboratorios

	--Categoria
	--1
	insert into Categorias values ('Limpieza', 'A')
	select * from Categorias
--Empaque
--1
insert into Empaques values ('Bolsa', 20, 'A', 1)
select * from Empaques
	--Unidad
	--1
	insert into UnidadesMedida values ('Kilogramos', 'KG', 'A')






------------------------------------------------------------------
--Para insertar PedidosDetalle
insert into PedidoDetalle values(20, 109, 2180, 0, 0, 0, 1, 2)
select * from PedidoDetalle