--TRIGGER PAGOS------------------------------------------------------

CREATE TRIGGER TR_realizarPago
ON Pagos
AFTER INSERT
AS

	DECLARE @idPedido INTEGER
	DECLARE @importe FLOAT
	DECLARE @aPagar FLOAT
	DECLARE @idPago INTEGER
	
	SET @idPedido = (Select idPedido from Pagos Where idPago = (Select idPago From inserted))
	SET @importe = (Select importe from Pagos Where idPago =(Select idPago From inserted))
	SET @idPago = (Select idPago From inserted)
	SET @aPagar = (Select totalPagar from Pedidos Where idPedido = @idPedido)
	if(@importe < @aPagar)
		delete from Pagos where idPago = @idPago

	if(@importe = @aPagar)
		UPDATE Pedidos SET totalPagar = totalPagar - @importe where idPedido = @idPedido

		

select * from Pagos
select * from Pedidos
insert into Pagos values ('2021-05-31', 180, 'A', 1, 1)

insert into Pagos values ('2021-05-31', 70, 'A', 6, 1)
DROP TRIGGER TR_realizarPago

insert into FormasPago values (1, 'Efectivo', 'A')
insert into FormasPago values (2, 'Tarjeta', 'A')