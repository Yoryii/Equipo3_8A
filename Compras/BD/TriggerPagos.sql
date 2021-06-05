--TRIGGER PAGOS------------------------------------------------------

CREATE TRIGGER TR_realizarPago
ON Pagos
FOR INSERT
AS

	DECLARE @idPedido INTEGER
	DECLARE @importe FLOAT
	DECLARE @aPagar FLOAT
	
	SET @idPedido = (Select idPedido from Pagos Where idPedido = (Select idPedido From inserted))
	SET @importe = (Select importe from Pagos Where idPago =(Select idPago From inserted))
	SET @aPagar = (Select totalPagar from Pedidos Where idPedido = @idPedido)
	if(@importe > @aPagar or @importe < @aPagar)
	print 'No se pudo realizar el pago'
	rollback
	if(@importe = @aPagar)
		UPDATE Pedidos SET totalPagar = totalPagar - @importe where idPedido = @idPedido

select * from Pagos
select * from Pedidos
insert into Pagos values ('2021-05-31', 230, 'A', 9, 1)

insert into Pagos values ('2021-05-31', 70, 'A', 6, 1)
DROP TRIGGER TR_realizarPago

insert into FormasPago values (1, 'Efectivo', 'A')
insert into FormasPago values (2, 'Tarjeta', 'A')