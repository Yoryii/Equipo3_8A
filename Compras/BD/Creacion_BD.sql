create database ERP
go

use ERP
go


---------------------------------------------------------
------------------------TABLAS---------------------------
---------------------------------------------------------

---------------------Recursos Humanos--------------------

Create Table FormasPago(
idFormaPago int primary key NOT NULL,
nombre varchar(50) NOT NULL,
estatus char NOT NULL
)

Create Table Periodos(
idPeriodo int primary key NOT NULL,
nombre varchar(50) NOT NULL,
fechaInicio date NOT NULL,
fechaFin date NOT NULL,
estatus char NOT NULL
)

Create Table Deducciones(
idDeduccion int primary key NOT NULL,
nombre varchar(30) NOT NULL,
descripcion varchar(80) NOT NULL,
porcentaje float NOT NULL
) 

Create Table Percepciones(
idPercepcion int primary key NOT NULL,
nombre varchar(30) NOT NULL,
descripcion varchar(80) NOT NULL,
diasPagar int NOT NULL
)

Create Table Puestos(
idPuesto int primary key NOT NULL,
nombre varchar(60) NOT NULL,
salarioMinimo float NOT NULL,
salarioMaximo float NOT NULL,
estatus char NOT NULL
)

Create Table Departamentos(
idDepartamento int primary key NOT NULL,
nombre varchar(50) NOT NULL,
estatus char NOT NULL
)

Create Table Turnos(
idTurno int primary key NOT NULL,
nombre varchar(20) NOT NULL,
horaInicio date NOT NULL,
horaFin date NOT NULL,
dias varchar(30) NOT NULL
)

Create Table Estados(
idEstado int primary key NOT NULL,
nombre varchar(60) NOT NULL,
siglas varchar(10) NOT NULL,
estatus char NOT NULL
)

Create Table Ciudades(
idCiudad int primary key NOT NULL,
nombre varchar(80) NOT NULL,
idEstado int NOT NULL,
estatus char NOT NULL,
Constraint fk_Ciudades_Estado FOREIGN KEY (idEstado) REFERENCES Estados (idEstado)
)

Create Table Empleados(
idEmpleado int primary key NOT NULL,
nombre varchar(30) NOT NULL,
apellidoPaterno varchar(30) NOT NULL,
apellidoMaterno varchar(30) NOT NULL,
sexo char NOT NULL,
fechaNacimiento date NOT NULL,
curp varchar(20) NOT NULL,
estadoCivil varchar(20) NOT NULL,
fechaContratacion date NOT NULL,
salarioDiario float NOT NULL,
nss varchar(10) NOT NULL,
diasVacaciones int NOT NULL,
diasPermiso int NOT NULL,
fotografia image,
direccion varchar(80) NOT NULL,
colonia varchar(50) NOT NULL,
codigoPostal varchar(5) NOT NULL,
escolaridad varchar(80) NOT NULL,
especialidad varchar(100) NOT NULL,
email varchar(100) NOT NULL,
pass varchar(20) NOT NULL,
tipo varchar(10) NOT NULL,
estatus char NOT NULL,
idDepartamento int NOT NULL,
idPuesto int NOT NULL,
idCiudad int NOT NULL,
idSucursal int NOT NULL,
idTurno int NOT NULL,
Constraint fk_Empleados_Ciudades FOREIGN KEY (idCiudad) REFERENCES Ciudades (idCiudad),
Constraint fk_Empleados_Departamentos FOREIGN KEY (idDepartamento) REFERENCES Departamentos (idDepartamento),
Constraint fk_Empleados_Puestos FOREIGN KEY (idPuesto) REFERENCES Puestos (idPuesto),
Constraint fk_Empleados_Turnos FOREIGN KEY (idTurno) REFERENCES Turnos (idTurno)
)

Create Table Asistencias(
idAsistencia int primary key NOT NULL,
fecha date NOT NULL,
horaEntrada date NOT NULL,
horaSalida date NOT NULL,
dia varchar(10) NOT NULL,
idEmpleado int NOT NULL,
Constraint fk_Asistencias_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado)
)

Create Table HistorialPuestos(
idEmpleado int primary key NOT NULL,
idPuesto int NOT NULL,
idDepartamento int NOT NULL,
fechaInicio date NOT NULL,
fechaFin date NOT NULL,
Constraint fk_Historial_Puestos FOREIGN KEY (idPuesto) REFERENCES Puestos (idPuesto),
Constraint fk_Historial_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado),
Constraint fk_Historial_Departamentos FOREIGN KEY (idDepartamento) REFERENCES Departamentos (idDepartamento)
)

Create Table AusenciasJustificadas(
idAudsencia int primary key NOT NULL,
fechaSolicitud date NOT NULL,
fechaInicio date NOT NULL,
fechaFin date NOT NULL,
tipo char NOT NULL,
idEmpleadoSolicita int NOT NULL,
idEmpleadoAutoriza int NOT NULL,
evidencia image NOT NULL,
estatus char NOT NULL,
motivo varchar(100) NOT NULL,
Constraint fk_AusenciasJustificadas_Empleados_2 FOREIGN KEY (idEmpleadoAutoriza) REFERENCES Empleados (idEmpleado),
Constraint fk_AusenciasJustificadas_Empleados FOREIGN KEY (idEmpleadoSolicita) REFERENCES Empleados (idEmpleado)
)

Create Table DocumentacionEmpleado(
idDocumento int primary key NOT NULL,
nombreDocumento varchar(80) NOT NULL,
fechaEntrega date NOT NULL,
documento image NOT NULL,
idEmpleado int NOT NULL,
Constraint fk_DocumentacionEmpleado_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado)
)

Create Table Nominas(
idNomina int primary key NOT NULL,
fechaElaboracion date NOT NULL,
fechaPago date NOT NULL,
subtotal float NOT NULL,
retenciones float NOT NULL,
total float NOT NULL,
diasTrabajados int NOT NULL,
estatus char NOT NULL,
idEmpleado int NOT NULL,
idFormaPago int NOT NULL,
idPeriodo int NOT NULL,
Constraint fk_Nominas_FormasPago FOREIGN KEY (idFormaPago) REFERENCES FormasPago (idFormaPago),
Constraint fk_Nominas_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado),
Constraint fk_Nominas_Periodos FOREIGN KEY (idPeriodo) REFERENCES Periodos (idPeriodo)

)

Create Table NominasDeducciones(
idNomina int NOT NULL,
idDeduccion int primary key NOT NULL,
importe float NOT NULL,
Constraint fk_NominasDeducciones_Nominas FOREIGN KEY (idNomina) REFERENCES Nominas (idNomina),
Constraint fk_NominasDeducciones_Deducciones FOREIGN KEY (idDeduccion) REFERENCES Deducciones (idDeduccion)
)

Create Table NominasPercepciones(
idNomina int NOT NULL,
idPercepcion int NOT NULL,
importe float NOT NULL,
Constraint pk_NominasPercepciones PRIMARY KEY (idNomina,idPercepcion),
Constraint fk_NominasPercepciones_Nominas FOREIGN KEY (idNomina) REFERENCES Nominas (idNomina),
Constraint fk_NominasPercepciones_Percepciones FOREIGN KEY (idPercepcion) REFERENCES	Percepciones (idPercepcion)
)

--------------------------Compras-----------------------------

create table Laboratorios (
	idLaboratorio int identity not null,
	nombre varchar(50) not null,
	origen varchar(30) not null,
	estatus char not null,
	constraint PK_Laboratorios primary key (idLaboratorio)
) 
go

create table Categorias (
	idCategoria int identity not null,
	nombre varchar(30) not null,
	estatus char not null,
	constraint PK_Categorias primary key (idCategoria)
)
go

create table Empaques (
	idEmpaque int identity not null,
	nombre varchar(80) not null,
	capacidad float not null,
	estatus char not null,
	idUnidad int not null,
	constraint PK_Empaques primary key (idEmpaque)
)
go

create table UnidadesMedida (
	idUnidad int identity not null,
	nombre varchar(80) not null,
	siglas varchar(20) not null,
	estatus char not null,
	constraint PK_UnidadMedida primary key (idUnidad)
)
go

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
)
go

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
)
go

create table PresentacionesProducto (
	idPresentacion int identity not null,
	precioCompra float not null,
	precioVenta float not null,
	puntoReorden float not null,
	idProducto int not null,
	idEmpaque int not null,
	constraint PK_PresentacionesProducto primary key (idPresentacion)
)
go

create table ExistenciasSucursal (
	idPresentacion int not null,
	idSucursal int not null,
	cantidad float not null,
	constraint PK_ExistenciasSucursal primary key (idPresentacion, idSucursal)
)
go

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
)
go

create table ImagenesProducto (
	idImagen int identity not null,
	nombreImagen varchar(100),
	imagen varbinary not null,
	principal char not null,
	idProducto int not null,
	constraint PK_ImagenesProducto primary key (idImagen)
)
go

create table ProductosProveedor (
	idProveedor int not null,
	idPresentacion int not null,
	diasRetardo int not null,
	precioEstandar float not null,
	precioUltimaCompra float not null,
	cantMinPedir int not null,
	cantMaxPedir int not null,
	constraint PK_ProductosProveedor primary key (idProveedor, idPresentacion)
)
go

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
)
go

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
)
go

create table ContactosProveedor (
	idContacto int identity not null,
	nombre varchar(80) not null,
	telefono varchar(12) not null,
	email varchar(100) not null,
	idProveedor int not null,
	constraint PK_ContactosProveedor primary key (idContacto)
)
go

create table Proveedores (
	idProveedor int identity not null,
	nombre varchar(80) not null,
	telefono varchar(12) not null,
	email varchar(100) not null,
	direccion varchar(80) not null,
	colonia varchar(50) not null,
	codigoPostal varchar(5) not null,
	idCiudad int not null,
	constraint PK_Proveedores primary key (idProveedor)
)
go

create table CuentasProveedor (
	idCuentaProveedor int identity not null,
	idProveedor int not null,
	noCuenta varchar(10) not null,
	banco varchar(30) not null,
	referenciaBancaria varchar(20) not null,
	constraint PK_CuentasProveedor primary key (idCuentaProveedor)
)
go

create table Pagos (
	idPago int not null,
	fecha date not null,
	importe float not null,
	idPedido int not null,
	idFormaPago int not null,
	constraint PK_Pagos primary key (idPago)
)
go


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

alter table PedidoDetalle add constraint FK_PedidoDetalle_Pedidos
foreign key(idPedido) references Pedidos(idPedido)
go 

alter table PedidoDetalle add constraint FK_PedidoDetalle_PresentacionesProducto
foreign key(idPresentacion) references PresentacionesProducto(idPresentacion)
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

---------------------Ventas--------------------------

----SalesVentaDetalle
create table SalesVentaDetalle(
   idVentaDetalle int primary key not null,
   precioVenta float not null,
   cantidad float not null,
   subtotal float not null,
   idVenta int not null
)

---SalesAsociaciones
create table SalesAsociaciones(
idAsosiacion int primary key not null,
nombre varchar(100) not null,
estatus char not null,
)


---SalesOfertasAsociacion
create table SalesOfertasAsociacion(
idAsosiacion int not null,
idOferta int not null,
estatus char not null,
CONSTRAINT PK_OfertaAsociacion PRIMARY KEY (idAsosiacion,idOferta),
CONSTRAINT FK_OfertaAsociacion_Asociacion FOREIGN KEY (idAsosiacion) 
REFERENCES SalesAsociaciones(idAsosiacion)
)

---SalesClientes
create table SalesClientes(
idCliente int primary key not null,
nombre varchar(100) not null,
razonSocial varchar(100) not null,
limiteCredito float not null,
rfc char(13) not null,
telefono char(12) not null,
email varchar(100) not null,
tipo char not null,
)

---SalesMiembros
create table SalesMiembros(
idCliente int not null,
idAsosiacion int not null,
estatus char not null,
fechaIncorporacion date not null,
CONSTRAINT PK_Miembros PRIMARY KEY (idAsosiacion,idCliente),
CONSTRAINT FK_Miembros_Clientes FOREIGN KEY (idCliente)
REFERENCES SalesClientes(idCliente),
CONSTRAINT FK_Miembros_Asociaciones FOREIGN KEY (idAsosiacion)
REFERENCES SalesAsociaciones(idAsosiacion)
)

---SalesCultivos
create table SalesCultivos(
    idCultivo   int primary key not null,
	nombre   varchar(100) not null,
	costoAsesoria float not null,
	estatus  char not null,
)

---SalesVentas
create table SalesVentas(
idVenta int primary key not null,
fecha date not null,
subtotal float not null,
iva float not null,
total float not null,
cantPagada float not null,
comentarios varchar(100),
estatus char not null,
tipo char not null,
idCliente int not null,
idSucursal int not null,
idEmpleado int not null,

CONSTRAINT FK_Ventas_Clientes FOREIGN KEY (idCliente)
REFERENCES SalesClientes(idCliente),
CONSTRAINT FK_Ventas_Empleado FOREIGN KEY (idEmpleado)
REFERENCES Empleados(idEmpleado),
CONSTRAINT FK_Ventas_Sucursales FOREIGN KEY (idSucursal)
REFERENCES Sucursales(idSucursal),

)



---SalesDireccionesCliente
create table SalesDireccionesCliente(
idDireccion int primary key not null,
calle varchar(100) not null,
numero varchar(15) not null,
colonia varchar(100) not null,
codigoPostal varchar(2) not null,
tipo char not null,
idCliente int not null,
idCiudad int not null,--falta su FK tabla RHCIUDAD
CONSTRAINT FK_Direcciones_Cliente_Clientes FOREIGN KEY (idCliente)
REFERENCES SalesClientes(idCliente),
CONSTRAINT FK_Direcciones_Cliente_Ciudades FOREIGN KEY (idCiudad)
REFERENCES Ciudades(idCiudad),

)

--SalesParcelas
create table SalesParcelas(
idParcela int primary key not null,
extension float not null,
idCliente int not null,
idCultivo int not null,
idDireccion int not null,

CONSTRAINT FK_Parcelas_Clientes FOREIGN KEY (idCliente)
REFERENCES SalesClientes(idCliente),
CONSTRAINT FK_Parcelas_Cultivos FOREIGN KEY (idCultivo)
REFERENCES SalesCultivos(idCultivo),
CONSTRAINT FK_Direcciones_Cliente FOREIGN KEY (idDireccion)
REFERENCES SalesDireccionesCliente(idDireccion),
)

--SalesUnidadesTransporte
create table SalesUnidadesTransporte(
idUnidadTransporte int primary key not null,
placas varchar(10) not null,
marca varchar(80) not null,
modelo varchar(80) not null,
anio int not null,
capacidad int not null,
tipo varchar(30) not null,
)

---SalesEnvios
create table SalesEnvios(
idEnvio int primary key not null,
fechaInicio date not null,
fechaFin date not null,
idUnidadTransporte int not null,
pesoTotal float not null,
CONSTRAINT FK_EnviosVentas_UnidadesTransporte FOREIGN KEY (idUnidadTransporte)
REFERENCES SalesUnidadesTransporte(idUnidadTransporte),
)


---SalesTripulacion
create table SalesTripulacion(
idEmpleado int not null,---falta esta es de tabla RH EMPLEADO FK
idEnvio int not null,
rol varchar(50) not null,

CONSTRAINT PK_Tripulacion PRIMARY KEY (idEmpleado,idEnvio,rol),

CONSTRAINT FK_Tripulacion_Envios FOREIGN KEY (idEnvio)
REFERENCES SalesEnvios(idEnvio),
CONSTRAINT FK_Tripulacion_Empleados FOREIGN KEY (idEmpleado)
REFERENCES Empleados(idEmpleado),

)

---SalesCobro
create table SalesCobro(
idCobro int primary key not null,
fecha date not null,
importe float not null,
idVenta int not null,

CONSTRAINT FK_Cobro_Ventas FOREIGN KEY (idVenta)
REFERENCES SalesVentas(idVenta)

)

---SalesDetallesEnvio
create table SalesDetallesEnvio(
idEnvio int not null,
idVenta int not null,
idDireccion int not null,
fechaEntregaPlaneada date not null,
peso float not null,
estatus char not null,
idContacto int not null,

CONSTRAINT PK_Detalles_Envio PRIMARY KEY (idEnvio,idVenta),

CONSTRAINT FK_Detalles_Envio_Envios FOREIGN KEY (idEnvio)
REFERENCES SalesEnvios(idEnvio),--
CONSTRAINT FK_Detalles_Envio_Ventas FOREIGN KEY (idVenta)
REFERENCES SalesVentas(idVenta),
CONSTRAINT FK_Detalles_Envio_Direcciones_Cliente FOREIGN KEY (idDireccion)
REFERENCES SalesDireccionesCliente(idDireccion)
)


--SalesContactosCliente
create table SalesContactosCliente(
idContacto int primary key not null,
nombre varchar(100) not null,
telefono varchar(12) not null,
email varchar(100) not null,
idCliente int not null,
CONSTRAINT FK_ContactosCliente_Clientes FOREIGN KEY (idCliente)
REFERENCES SalesClientes(idCliente),
)


---SalesAsesorias
create table SalesAsesorias(
idAsesoria int primary key not null,
fecha date not null,
comentarios varchar(200) not null,
estatus char not null,
costo float not null,
idParcela int not null,
idEmpleado int not null, 
idUnidadTransporte int not null,

CONSTRAINT FK_Asesorias_clientesCultivos FOREIGN KEY (idParcela)
REFERENCES SalesParcelas(idParcela),
CONSTRAINT FK_Asesorias_UnidadesTransporte FOREIGN KEY (idUnidadTransporte)
REFERENCES SalesUnidadesTransporte(idUnidadTransporte),
CONSTRAINT FK_Asesorias_Empleados FOREIGN KEY (idEmpleado)
REFERENCES Empleados(idEmpleado),
)



--SalesMantenimiento
create table SalesMantenimiento(
idMantenimiento int primary key not null,
fechaInicio date not null,
fechaFin date not null,
taller varchar(100) not null,
costo float not null,
comentarios varchar(200),
tipo varchar(30) not null,
idUnidadTransporte int not null,

CONSTRAINT FK_Mantenimiento_UnidadesTransporte FOREIGN KEY (idUnidadTransporte)
REFERENCES SalesUnidadesTransporte(idUnidadTransporte),
)

alter table SalesVentaDetalle add constraint FK_SalesVentaDetalle_SalesVentas
foreign key(idVenta) references SalesVentas(idVenta)
go 

alter table SalesDetallesEnvio add constraint FK_SalesDetallesEnvio_SalesContactosCliente
foreign key(idContacto) references SalesContactosCliente(idContacto)
go 
