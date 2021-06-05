--TRIGGER
USE ERP
GO

CREATE TRIGGER TR_updateTotalPagar
ON PedidoDetalle
FOR INSERT
AS
--Identificar pedido, totalPagar
	DECLARE @idPedido INTEGER
	DECLARE @subtotal FLOAT
	DECLARE @aPagar FLOAT
	
	SET @idPedido = (Select idPedido from PedidoDetalle Where idPedidoDetalle = (Select idPedidoDetalle From inserted))
	SET @subtotal = (Select subtotal from PedidoDetalle Where idPedidoDetalle =(Select idPedidoDetalle From inserted))
	SET @aPagar = (Select totalPagar from Pedidos Where idPedido = @idPedido)
	
	if(@aPagar is null)
		UPDATE Pedidos SET totalPagar = @subtotal where idPedido = @idPedido
	else
		UPDATE Pedidos SET totalPagar = totalPagar + @subtotal where idPedido = @idPedido


--Prueba
Select * from Pedidos
Select * from PedidoDetalle

Update Pedidos set estatus='C' where idPedido = 4

DROP TRIGGER TR_realizarPago

--TRIGGER PAGOS------------------------------------------------------

CREATE TRIGGER TR_realizarPago
ON Pagos
FOR INSERT
AS
--Identificar pedido, totalPagar
	DECLARE @idPedido INTEGER
	DECLARE @importe FLOAT
	DECLARE @aPagar FLOAT
	
	SET @idPedido = (Select idPedido from PedidoDetalle Where idPedidoDetalle = (Select idPedidoDetalle From inserted))
	SET @importe = (Select importe from Pagos Where idPago =(Select idPago From inserted))
	SET @aPagar = (Select totalPagar from Pedidos Where idPedido = @idPedido)
		UPDATE Pedidos SET totalPagar = totalPagar - @importe where idPedido = @idPedido



insert into FormasPago values (1, 'Efectivo', 'A')
insert into FormasPago values (2, 'Tarjeta', 'A')