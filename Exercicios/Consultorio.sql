create database bd_Consultorio;
use bd_Consultorio;

create table tb_Paciente(
	Id_Paciente int not null auto_increment, /*chave primaria*/
	Nome_Paciente varchar(100) not null, /*aceita letras, números e caracteres especiais*/
	Data_Nascimento_Paciente date, /*segue o modelo americano ano/mes/dia*/
	Genero_Paciente enum('f', 'm', 'nao-binario', 'trans'), 
	Cpf_Paciente varchar(14), /*campo aceita valores pré determinados*/
    constraint Pk_Id_Paciente primary key (Id_Paciente) /*aviso de primary key*/
);

describe tb_Paciente;

insert into tb_Paciente (Nome_Paciente, Data_Nascimento_Paciente, Genero_Paciente, Cpf_Paciente) values
('Roberto Carlos', '1941-04-19', 'm', '999.999.999-99'),
('MaTuê', '1941-04-19', 'm', '888.888.888-63'),
('Pedro Paulo Soares Pereira', '1941-04-19', 'm', '777.777.777-63'),
('Clarisse Linspector', '1920-12-10', 'f', '666.666.666-63'),
('Cauê', '2004-10-18', 'm', '555.555.555-55');

select * from tb_Paciente;

create table tb_Medico(
Pk_Id_Medico int not null auto_increment,
Nome_Medico varchar(100) not null,
Data_Nascimento_Medico date,
Genero_Medico enum('f', 'm', 'nao-binario', 'trans'),
CRM_Medico varchar(13),
Cpf_Medico varchar(14),
Especialidade_Medico varchar(25) not null,
constraint Pk_Id_Medico primary key (Id_Medico)
);

insert into tb_Medico (Nome_Medico, Data_Nascimento_Medico, Genero_Medico, CRM_Medico, Cpf_Medico, Especialidade_Medico) values
('Paulo Henrique','1988-09-09','m','CRM/SP 999999','999.999.999-99','Cirurgiao'),
('Gabriela Cattuzo','1990-10-10','f','CRM/SP 888888','888.888.888-88','Clinica'),
('Bruna Lopes','1992-02-02','f','CRM/SP 222222','222.222.222-22','Medico'),
('Renata Dias','1998-12-10','f','CRM/SP 111111','444.444.444-22','Assistente'),
('Fabiana Miranda','1985-08-20','f','CRM/SP 555555','555.555.555-55','Ortopedista');

select * from tb_Medico;

create table tb_Consulta(
Id_Consulta int not null auto_increment,
Data_Consulta date,
Hora_Consulta time,
Status_Consulta enum('Agendada', 'Realizada', 'Cancelada'),
Fk_Id_Paciente int not null,
Fk_Id_Medico int not null,

constraint Id_Consulta primary key (Id_Consulta),

constraint Fk_Id_Paciente foreign key (Fk_Id_Paciente)
references tb_Paciente (Id_Paciente),

constraint Fk_Id_Medico foreign key (Fk_Id_Medico)
references tb_Medico (Id_Medico)
);

describe tb_Consulta;

alter table tb_Paciente
add convenio varchar(50); /*alteração na estrutura na tabela*/

describe tb_Paciente;

alter table tb_Livro
add constraint Fk_Id_Autor foreign key (Fk_Id_Autor)
references tb_Autor(Pk_Id_Autor);

select Nome_Paciente, Genero_Paciente from tb_Paciente;

INSERT INTO tb_Consulta(Hora_Consulta, Data_Consulta, Fk_Id_Medico, Fk_Id_Paciente) values
    ("11:23:54", "2024-05-24", 1, 1),
	("15:03:34", "2024-05-24", 1, 1),
    ("14:53:14", "2024-05-24", 1, 1),
    ("13:13:04", "2024-05-24", 1, 1),
    ("12:23:04", "2024-05-24", 1, 1);
    
describe tb_Paciente;
select * from tb_Paciente;

update tb_Paciente
set convenio = 'Bom esse'
where Nome_Paciente = 'Clarisse Linspector';

select * from tb_Consulta;
select * from tb_Consulta as c /*exibir tudo das tabelas*/
join tb_Paciente as p /*juntando a tabela consulta com a tabela paciente*/
on c.id_Consulta = p.id_Paciente; /*onde a ligação sera pelo ID das duas tabelas*/

/* os apelidos são registrados através da clausula AS que tb podem ser chamdos de ALIAS */
/*join duas tabelas e inner join mais tabelas*/

select * from tb_Consulta as c
join tb_Paciente as p
on c.id_Consulta = p.id_Paciente
join tb_Medico as m
on c.id_Consulta = m.id_Medico
order by p.Nome_Paciente; /* order by coloca em ordem alfabetica*/
 
select * from tb_Consulta;
delete from tb_Consulta
where fk_id_Medico = 1;

drop database bd_consultorio;

