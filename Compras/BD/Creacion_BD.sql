create database ERP
go

use ERP
go


---------------------------------------------------------
------------------------TABLAS---------------------------
---------------------------------------------------------

create table Laboratorios (
	idLaboratorio int identity not null,
	nombre varchar(50) not null,
	origen varchar(30) not null,
	estatus char not null,
	constraint PK_Laboratorios primary key (idLaboratorio)
)go

create table Categorias (
	idCategoria int identity not null,
	nombre varchar(30) not null,
	estatus char not null,
	constraint PK_Categorias primary key (idCategoria)
)go

create table Empaques (
	idEmpaque int identity not null,
	nombre varchar(80) not null,
	capacidad float not null,
	estatus char not null,
	idUnidad int not null,
	constraint PK_Empaques primary key (idEmpaque)
)go

create table UnidadesMedida (
	idUnidad int identity not null,
	nombre varchar(80) not null,
	siglas varchar(20) not null,
	estatus char not null,
	constraint PK_UnidadMedida primary key (idUnidad)
)go

create table Ofertas (
	idOferta int identity not null,
	nombre varchar(50) not null,
	descripcion varchar(100) not null,
	porDescuento float not null,
	fechaInicio date not null,
	fechaFin date not null,
	canMinProductos int not null,
	estatus char not null,
	idPresentacion int not null,
	constraint PK_Ofertas primary key (idOferta)
)go

create table Productos (
	idProducto int identity not null,
	nombre varchar(50) not null,
	descripcion varchar(100) not null,
	ingredienteActivo varchar(100) not null,
	bandaToxicologica varchar(80) not null,
	aplicacion varchar(200) not null,
	uso varchar(200) not null,
	estatus char not null,
	idLaboratorio int not null,
	idCategoria int not null,
	constraint PK_Productos primary key (idProducto)
)go

create table PresentacionesProducto (
	idPresentacion int identity not null,
	precioCompra float not null,
	precioVenta float not null,
	puntoReorden float not null,
	idProducto int not null,
	idEmpaque int not null,
	constraint PK_PresentacionesProducto primary key (idPresentacion)
)go

create table ExistenciasSucursal (
	idPresentacion int not null,
	idSucursal int not null,
	cantidad float not null,
	constraint PK_ExistenciasSucursal primary key (idPresentacion, idSucursal)
)go

create table Sucursales (
	idSucursal int identity not null,
	nombre varchar(50) not null,
	telefono varchar(15) not null,
	direccion varchar(80) not null,
	colonia varchar(50) not null,
	codigoPostal varchar(5) not null,
	presupuesto float not null,
	estatus char not null,
	idCiudad int not null,
	constraint PK_Sucursales primary key (idSucursal)
)go

create table ImagenesProducto (
	idImagen int identity not null,
	nombreImagen varchar(100),
	imagen varbinary not null,
	principal char not null,
	idProducto int not null,
	constraint PK_ImagenesProducto primary key (idImagen)
)go

create table ProductosProveedor (
	idProveedor int not null,
	idPresentacion int not null,
	diasRetardo int not null,
	precioEstandar float not null,
	precioUltimaCompra float not null,
	cantMinPedir int not null,
	cantMaxPedir int not null,
	constraint PK_ProductosProveedor primary key (idProveedor, idPresentacion)
)go

create table PedidoDetalle (
	idPedidoDetalle int identity not null,
	cantPedida int not null,
	precioCompra float not null,
	subTotal float not null,
	cantRecibida int not null,
	cantRechazada int not null,
	cantAceptada float not null,
	idPedido int not null,
	idPresentacion int not null,
	constraint PK_PedidoDetalle primary key (idPedidoDetalle)
)go

create table Pedidos (
	idPedido int identity not null,
	fechaRegistro date not null,
	fechaRecepcion date not null,
	totalPagar float not null,
	cantidadPagada float not null,
	estatus char not null,
	idProveedor int not null,
	idSucursal int not null,
	idEmpleado int not null,
	constraint PK_Pedidos primary key (idPedido)
)go

create table ContactosProveedor (
	idContacto int identity not null,
	nombre varchar(80) not null,
	telefono varchar(12) not null,
	email varchar(100) not null,
	idProveedor int not null,
	constraint PK_ContactosProveedor primary key (idContacto)
)go

create table Proveedores (
	idProveedor int identity not null,
	nombre varchar(80) not null,
	telefono varchar(12) not null,
	email varchar(100) not null,
	direccion varchar(80) not null,
	colonia varchar(50) not null,
	codigoPostal varchar(5) not null,
	constraint PK_Proveedores primary key (idProveedor)
)go

create table CuentasProveedor (
	idCuentaProveedor int identity not null,
	idProveedor int not null,
	noCuenta varchar(10) not null,
	banco varchar(30) not null,
	referenciaBancaria varchar(20) not null,
	constraint PK_CuentasProveedor primary key (idCuentaProveedor)
)go

create table Pagos (
	idPago int not null,
	fecha date not null,
	importe float not null,
	idPedido int not null,
	idFormaPago int not null,
	constraint PK_Pagos primary key (idPago)
)go


-----------------------------------------------------------
-----------------------Claves Foraneas---------------------
-----------------------------------------------------------

alter table Empaques add constraint FK_Empaques_UnidadMedida
foreign key(idUnidad) references UnidadesMedida(idUnidad)
go 

alter table Ofertas add constraint FK_Ofertas_PresentacionesProducto
foreign key(idPresentacion) references PresentacionesProducto(idPresentacion)
go 

alter table Productos add constraint FK_Productos_Laboratorios
foreign key(idLaboratorio) references Laboratorios(idLaboratorio)
go 

alter table Productos add constraint FK_Productos_Categorias
foreign key(idCategoria) references Categorias(idCategoria)
go 

alter table PresentacionesProducto add constraint FK_PresentacionesProducto_Productos
foreign key(idProducto) references Productos(idProducto)
go 

alter table PresentacionesProducto add constraint FK_PresentacionesProducto_Empaques
foreign key(idEmpaque) references Empaques(idEmpaque)
go 

alter table ExistenciasSucursal add constraint FK_ExistenciasSucursal_Sucursales
foreign key(idSucursal) references Sucursales(idSucursal)
go 

alter table ExistenciasSucursal add constraint FK_ExistenciasSucursal_PresentacionesProducto
foreign key(idPresentacion) references PresentacionesProducto(idPresentacion)
go 

alter table Sucursales add constraint FK_Sucursales_Ciudades
foreign key(idCiudad) references Ciudades(idCiudad)
go 

alter table ImagenesProducto add constraint FK_ImagenesProducto_Productos
foreign key(idProducto) references Productos(idProducto)
go 

alter table ProductosProveedor add constraint FK_ProductosProveedor_Proveedores
foreign key(idProveedor) references Proveedores(idProveedor)
go 

alter table ProductosProveedor add constraint FK_ProductosProveedor_PresentacionesProducto
foreign key(idPresentacion) references PresentacionesProducto(idPresentacion)
go 

alter table PedidosDetalle add constraint FK_PedidosDetalle_Pedidos
foreign key(idPedido) references Pedidos(idPedido)
go 

alter table PedidosDetalle add constraint FK_PedidosDetalle_PresentacionesProducto
foreign key(idPresentacion) references PresentacionesProducto(idPrecentacion)
go 

alter table Pedidos add constraint FK_Pedidos_Proveedores
foreign key(idProveedor) references Proveedores(idProveedor)
go 

alter table Pedidos add constraint FK_Pedidos_Sucursales
foreign key(idSucursal) references Sucursales(idSucursal)
go 

alter table Pedidos add constraint FK_Pedidos_Empleados
foreign key(idEmpleado) references Empleados(idEmpleado)
go 

alter table ContactosProveedor add constraint FK_ContactosProveedor_Proveedores
foreign key(idProveedor) references Proveedores(idProveedor)
go 

alter table Proveedores add constraint FK_Proveedores_Ciudades
foreign key(idCiudad) references Ciudades(idCiudad)
go 

alter table CuentasProveedor add constraint FK_CuentasProveedor_Proveedores
foreign key(idProveedor) references Proveedores(idProveedor)
go 

alter table Pagos add constraint FK_Pagos_Pedidos
foreign key(idPedido) references Pedidos(idPedido)
go 

alter table Pagos add constraint FK_Pagos_FormasPago
foreign key(idFormaPago) references FormasPago(idFormaPago)
go 