create database Compras
go

use Compras
go

create table Laboratorios (
	idLaboratorio int not null,
	nombre varchar(50) not null,
	origen varchar(30) not null,
	estatus char not null,
	constraint pk_laboratorios primary key (idLaboratorio)
)
go

create table Categorias (
	idCategoria int not null,
	nombre varchar(30) not null,
	estatus char not null,
	constraint pk_categorias primary key (idCategoria)
)
go

create table UnidadesMedida (
	idUnidad int not null,
	nombre varchar(80) not null,
	siglas varchar(20) not null,
	estatus char not null,
	constraint pk_unidadMedida primary key (idUnidad)
)
go

create table Empaques (
	idEmpaque int not null,
	nombre varchar(80) not null,
	capacidad float not null,
	estatus char not null,
	idUnidad int not null,
	constraint pk_empaques primary key (idEmpaque),
	constraint fk_unidadesMedida_Empaques foreign key (idUnidad) references UnidadesMedida (idUnidad)
)
go