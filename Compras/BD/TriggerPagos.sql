--TRIGGER PAGOS------------------------------------------------------

CREATE TRIGGER TR_realizarPago
ON Pagos
FOR INSERT
AS
--Identificar pedido, totalPagar
	DECLARE @idPedido INTEGER
	DECLARE @importe FLOAT
	DECLARE @aPagar FLOAT
	
	SET @idPedido = (Select idPedido from Pagos Where idPedido = (Select idPedido From inserted))
	SET @importe = (Select importe from Pagos Where idPago =(Select idPago From inserted))
	SET @aPagar = (Select totalPagar from Pedidos Where idPedido = @idPedido)
		UPDATE Pedidos SET totalPagar = totalPagar - @importe where idPedido = @idPedido

select * from Pagos

insert into FormasPago values (1, 'Efectivo', 'A')
insert into FormasPago values (2, 'Tarjeta', 'A')