create database DB_CDS;
use DB_CDS;

/*tabela 1*/
create table tb_Artista(
Cod_Art int not null auto_increment,
Nome_Art varchar(100) not null,

constraint Pk_Cod_art primary key (Cod_Art)
);

insert into tb_Artista(Nome_Art) values
('Bruno'),
('Paulo');

select * from tb_Artista;



/*tabela 2*/
create table tb_Gravadora(
Cod_Grav int not null auto_increment,
Nome_Grav varchar(50) not null,


constraint Pk_Cod_Grav primary key (Cod_Grav)
);
insert into tb_Gravadora(Nome_Grav) values
('Gravadora Bruno'),
('Gravadora Paulo');

select * from tb_Gravadora;

/*tabela 3*/
create table tb_Categoria(
Cod_Cat int not null auto_increment,
Nome_Cat varchar(50) not null,

constraint Pk_Cod_Cat primary key (Cod_Cat)
);

insert into tb_Categoria(Nome_Cat) values
('Bruno Categoria'),
('Paulo Categoria');

select * from tb_Categoria;

/*tabela 4*/
create table tb_Estado(
Sigla_Est int not null auto_increment,
Nome_Est varchar(50),

constraint Pk_Sigla_Est primary key (Sigla_Est)
);

insert into tb_Estado(Nome_Est) values
('Brasil'),
('Estados Unidos');

select * from tb_Estado;


/*tabela 5*/
create table tb_Cidade(
Cod_Cid int not null auto_increment,
Sigla_Est varchar(2) not null,
Nome_Cid varchar(100) not null,

constraint Pk_Cod_Cid primary key (Cod_Cid),

Pk_Sigla_Est int not null,
constraint Fk_Sigla_Est foreign key (Pk_Sigla_Est)
references tb_Estado(Sigla_Est)

);

insert into tb_Cidade(Sigla_Est, Nome_Cid) values
('BR', 'Sâo Paulo'),
('US', 'Washington');


select * from tb_Cidade;


/*tabela 6*/
create table tb_Cliente(
Cod_Cli int not null auto_increment,
Nome_Cli varchar(100) not null,
End_Cli varchar(200) not null,
Renda_Cli decimal(10,2) default("0")not null,
Sexo_Cli enum('F', 'M') default "F",

constraint Pk_Cod_Cli primary key (Cod_Cli),
Pk_Cod_Cid int not null,
constraint Fk_Cod_Cid foreign key (Pk_Cod_Cid) references tb_Cidade(Cod_Cid),
constraint MaiorQ_Renda_Cli check (Renda_Cli >= 0)
);

Describe tb_Cliente;

/*tabela 7*/
create table tb_Conjuge(
Cod_Cli int not null,
Nome_Conj varchar(100) not null,
Renda_Conj decimal(10,2) not null default "0",
Sexo_Conj enum("F","M") default "M",

primary key (Cod_Cli),
constraint Fk_Cli_Conj foreign key (Cod_Cli) references tb_Cliente(Cod_Cli),
constraint MaiorQ_Renda_Conj check (Renda_Conj >= 0)
);

describe tb_Conjuge;

/*tabela 8*/

create table tb_Funcionario(
Cod_Func int not null,
Nome_Func varchar(100) not null,
End_Func varchar(100) not null,
Sal_Func decimal(10,2) not null default "0",
Sexo_Func enum("F","M") not null,
primary key (Cod_Func),
constraint MaiorQ_Salario check (Sal_Func >= 0)
);
describe tb_Funcionario;

create table tb_Dependente(
Cod_Dep int not null,
Cod_Func int not null,
Nome_Dep varchar(100) not null,
Sexo_Dep enum("F","M") not null,
primary key(Cod_Dep),

constraint Fk_Funcionario_Dependente foreign key (Cod_Func) 
references tb_Funcionario(Cod_Func)
);

describe tb_Dependente;

create table tb_Titulo(
Cod_Tit int not null,
Cod_Cat int not null,
Cod_Grav int not null,
Nome_CD varchar(100) not null unique,
Val_CD decimal(10,2) not null,
Qtd_Estq int not null,
primary key(Cod_Tit),
constraint Fk_Titulo_Categoria foreign key(Cod_Cat) references tb_Categoria(Cod_Cat),
constraint Fk_Titulo_Gravadora foreign key(Cod_Grav) references tb_Gravadora(Cod_Grav),
constraint MaiorQ_ValorCD check (Val_CD > 0)

);

describe tb_Titulo;

create table tb_Pedido(
Num_Ped int not null,
Cod_Cli int not null,
Cod_Func int not null,
Data_Ped datetime not null,
Val_Ped decimal(10,2) not null default "0",
primary key(Num_Ped),
constraint Fk_Pedido_Cliente foreign key(Cod_Cli) references tb_Cliente(Cod_Cli),
constraint Fk_Pedodp_Funcionario foreign key(Cod_Func) references tb_Funcionario(Cod_Func),
constraint MaiorQ_ValorPedido check (Val_Ped >= 0)
);

describe tb_Pedido;

create table tb_Titulo_Pedido(
Num_Ped int not null,
Cod_Tit int not null,
Qtd_CD int not null,
Val_CD decimal(10,2) not null,
primary key(Num_Ped, Cod_Tit),
constraint Fk_TituloPedido_NumPed foreign key (Num_Ped) references tb_Pedido(Num_Ped),
constraint Fk_TituloPedido_Cod_Tit foreign key (Cod_Tit) references tb_Titulo(Cod_Tit),
constraint MaiorQ_QuantidadeCD check (Qtd_CD >= 1),
constraint MaiorQ_TituloPedido_ValorCD check (Val_CD > 0)
);
describe tb_Titulo_Pedido;

create table tb_Titulo_Artista(
Cod_Tit int not null,
Cod_Art int not null,
constraint Fk_Titulo_Artista_Titulo foreign key (Cod_Tit) references tb_Titulo(Cod_Tit),
constraint Fk_Titulo_Artista_Artista foreign key (Cod_Art) references tb_Artista(Cod_Art)
);
describe tb_Titulo_Artista