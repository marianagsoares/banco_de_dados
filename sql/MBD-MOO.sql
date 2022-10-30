CREATE DATABASE Academia;
-- ------------------------------------------CARDINALIDADES ----------------------------------------------------------
-- 1: N UNIDADE E COLABORADOR
-- 1: N SETOR E COLABORADOR
-- N: N UNIDADE E SETOR
-- 1: 1 ENDERECO E COLABORADOR

USE Academia;


DROP TABLE setor_unidade;
DROP TABLE endereco;
DROP TABLE colaborador;
DROP TABLE unidade;
DROP TABLE setor;

 -- -----------------------------------------------TABELA SETOR ---------------------------------------------------
CREATE TABLE  setor (
	idSetor INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(20)
);
 -- -----------------------------------------------TABELA UNIDADE ---------------------------------------------------
CREATE TABLE unidade(
idUnidade INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(20) NOT NULL,
uf VARCHAR(2) NOT NULL,
cep CHAR(11) NOT NULL,
rua VARCHAR(20) NOT NULL,
bairro VARCHAR(10) NOT NULL,
numero VARCHAR(3) NOT NULL
);

 -- -----------------------------------------------TABELA COLABORADOR ---------------------------------------------------
CREATE TABLE colaborador (
	idColaborador INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR (10) NOT NULL,
    sobrenome VARCHAR(10),
    ultimoNome VARCHAR(10) NOT NULL,
    dataNasc DATE NOT NULL,
    sexo CHAR(1) NOT NULL,
    email VARCHAR(20) NOT NULL,
    cpf  CHAR(14) NOT NULL,
    salario DECIMAL (6,2) NOT NULL,
    idSetor INTEGER NOT NULL,
    FOREIGN KEY (idSetor) REFERENCES setor(idSetor),
    idUnidade INTEGER NOT NULL,
    FOREIGN KEY (idUnidade) REFERENCES unidade(idUnidade)
    );
    
     -- -----------------------------------------------TABELA ENDERECO---------------------------------------------------
   CREATE TABLE endereco (
   idEndereco INTEGER PRIMARY KEY AUTO_INCREMENT,
   uf CHAR(2) NOT NULL,
   cidade VARCHAR (20)  NOT NULL,
   bairro VARCHAR (20)  NOT NULL,
   rua VARCHAR (20)  NOT NULL,
   cep INTEGER NOT NULL,
   numero VARCHAR(4)  NOT NULL,
   idColaborador INTEGER NOT NULL,
   FOREIGN KEY (idColaborador) REFERENCES colaborador(idColaborador)
   );

-- ---------------------------- TABELA DE RELACIONAMENTO ENTRE SETOR_UNIDADE---------------------------------------------------------
CREATE TABLE setor_unidade(
idSetor_unidade INTEGER PRIMARY KEY AUTO_INCREMENT,
idSetor INTEGER NOT NULL,
idUnidade INTEGER NOT NULL,
FOREIGN KEY (idSetor) REFERENCES setor(idSetor),
FOREIGN KEY (idUnidade) REFERENCES unidade(idUnidade)
);

-- ----------------------------------------COMANDOS DE MANIPULACAO INSERT------------------------------------

INSERT INTO setor VALUES
(NULL, "Serviços Gerais"),
(NULL, "Instrutores"),
(NULL, "Recepção");

INSERT INTO unidade VALUES 
(NULL, "Unidade Boa Viagem", "PE", "58-360-020", "Rua do socego", "Boa Viagem", "56"),
(NULL, "Unidade Piedade", "PE", "59-399-020", "Rua Ayrton Sena", "Piedade", "88"),
(NULL, "Unidade Aliados", "PE", "89-111-020", "Rua Domingos", "Aliados", "15"),
(NULL,"Unidade Ilha", "PE", "89-881-028", "Rua do Sport", "Ilha", "55"),
(NULL, "Unidade Madalena", "PE", "99-888-050", "Rua Dom Joao", "Madalena", "87"),
(NULL, "Unidade Aflitos", "PE", "99-851-000", "Rua das Creolas", "Aflitos", "32");

INSERT INTO colaborador VALUES 
(NULL, "Ricardo", "Ferreira", "Melo", "1993-09-08", "M", "ricardo@gmail.com", "111.222.333-04", 2500.0, 2, 1, "superior completo", "2022"),
(NULL, "Gustavo", "Henrique", "Fernandes", "1999-10-08", "M", "gustavo@hotmail.com", "444.222.333-04", 2600.0, 2, 2,  "superior completo", "2012"),
(NULL, "Fransisca", "Romeno", "Silva", "1980-02-03", "F", "fransc@hotmail.com", "777.222.333-04", 1000.0, 2, 3, "superior completo",  "2015"),
(NULL, "Julio", "Corte", "Andrade", "1996-09-09", "M", "julio@hotmail.com", "220.222.564-04", 2800.0, 2, 4, "Superior Completo", "2021");

INSERT INTO colaborador (idColaborador, nome, ultimoNome, dataNasc, sexo, email, cpf, salario, idSetor, idUnidade, formacao, anoAdmissao) VALUES
(NULL, "Julia", "Katz", "2000-09-03", "F", "julia@outlook.com", "555-888-333-04", 2500.0, 2, 5,  "superior completo", "2022"), 
(NULL, "Kelvin", "Schuster", "1989-01-11", "M", "kelvin@gmail.com", "111-118-333-04", 4000.0, 2, 6, "superior completo", "2020"),
(NULL, "Silvia", "Bonevar", "1994-01-05", "F", "silvia@outlook.com", "999-118-333-04", 1000.0, 2, 1, "superior completo", "2013");

INSERT INTO colaborador (idColaborador, nome, sobrenome, ultimoNome, dataNasc, sexo, email, cpf, salario, idSetor, idUnidade, anoAdmissao) VALUES
(NULL, "Josefa", "Martins", "Ferreira", "1992-03-03", "F", "josefa@outlook.com", "125-118-333-04", 2500.0, 3, 2, "2014"),
(NULL, "Gabriela", "Montenegro", "Silva", "1990-10-12", "F", "gabriela@outlook.com", "122-118-333-04", 2500.0, 1, 3, "2015"),
(NULL, "Jenifer", "Katerine", "Josias", "1888-01-11", "F", "jenifer@gmail.com", "999-118-333-04", 1000.0, 1, 4, "2017"),
(NULL, "Lilian", "Siqueira", "Lima", "1995-02-02", "F", "lilian@gmail.com", "222.222.333-04", 1200.0, 3, 5, "2015"),
(NULL, "Jose", "Marques", "Fernandes", "1989-08-08", "M", "jose@gmail.com", "999-999-02", 1200.0, 3, 6, "2017"),
(NULL, "Henrique", "Josias", "Soares", "1829-07-09", "M", "henrique@hotmail.com", "166-666-03", 1300.0, 3, 1, "2014"),
(NULL, "Aurora", "Correia", "Nunes", "1995-10-03", "F", "aurora@hotmail.com", "222.222.333-04", 2800.0, 3, 2, "2016"),
(NULL, "Maria", "Figueira", "Santos", "1986-12-03", "F", "maria@hotmail.com", "666.222.333-99", 1000.0, 1, 3, "2018");

INSERT INTO endereco VALUES
(NULL, "PE", "Jaboatao", "Piedade", "Rua Ayrton Sena", 52.360-000, "50-A", 1, "Próximo a Santo Cristo"),
(NULL, "PE", "Jaboatao", "Jaboatao Centro", "Rua de Peixinhos", 24.222-060, "59", 6, "Em frente a Ribeira"),
(NULL, "PE", "Jaboatao", "Boa viagem", "Rua Barros Vieira", 59.650-070, "2-D", 8, "Próximo ao Supermercado Extra"),
(NULL, "PE", "Jaboatao", "Piedade", "Rua Ayrton Sena", 58.399-030, "99-A", 9, "Ao lado do Shopping Plaza"),
(NULL, "PE", "Jaboatao", "Imbiribeira", "Rua Agamenon", 50.360-028, "32-A", 12, "Próximo ao Supermercado extra"),
(NULL, "PE", "Recife", "Ilha do leite", "Rua Domingos", 64.360-090, "45", 13, "Ao lado da CEF"),
(NULL, "PE", "Jaboatao", "Muribeca", "Rua Ferreira Lopes", 84.360-000, "10-B", 15, "Próximo a CELPE");

INSERT INTO endereco (idEndereco, uf, cidade, bairro, rua, cep, numero, idColaborador) VALUES
(NULL, "PE", "Recife", "Ibura", "Rua da Alegria", 50.318-020, "52-C", 2),
(NULL, "PE", "Recife", "Madalena", "Rua da Soledade", 58.000-020, "18", 3),
(NULL, "PE", "Recife", "Casa Forte", "Rua Anibal Coelho", 64.300-020, "25-A", 4),
(NULL, "PE", "Jaboatao", "Muribeca", "Rua Principal", 94.65-040, "53", 5),
(NULL, "PE", "Recife", "Iputinga", "Rua Fernandes Lima", 34.360-920, "55", 7),
(NULL, "PE", "Recife", "Boa viagem", "Rua Carapuceiro", 50.890-020, "66-A", 10),
(NULL, "PE", "Recife", "Iputinga", "Rua Franco Mota", 53.960-090, "625", 11),
(NULL, "PE", "Olinda", "Peixinhos", "Rua Barros Lima", 94.360-030, "33", 14);

INSERT INTO setor_unidade VALUES 
(NULL, 1, 1),(NULL, 1, 2),(NULL, 1, 3),(NULL, 1, 4),(NULL, 1, 5),(NULL, 1, 6),
(NULL, 2, 1),(NULL, 2, 2),(NULL, 2, 3),(NULL, 2, 4),(NULL, 2, 5),(NULL, 2, 6),
(NULL, 3, 1),(NULL, 3, 2),(NULL, 3, 3),(NULL, 3, 4),(NULL, 3, 5),(NULL, 3, 6);

-- ----------------------------------------COMANDOS DE MANIPULACAO UPDATE, INSERT E DELETE------------------------------------


ALTER TABLE colaborador
ADD COLUMN formacao VARCHAR(30) DEFAULT ("2 grau completo");

-- ALTER TABLE colaborador
-- ADD COLUMN anoAdmissao CHAR(10);

-- ALTER TABLE colaborador
-- DROP COLUMN anoAdmissao;

ALTER TABLE colaborador
ADD COLUMN anoAdmissao CHAR(4);

ALTER TABLE endereco
ADD COLUMN complemento VARCHAR(30) DEFAULT ("Sem complemento");

INSERT INTO colaborador (idColaborador, nome, ultimoNome, dataNasc, sexo, email, cpf, salario, idSetor, idUnidade, anoAdmissao) 
VALUES (NULL, "Fábio", "Novisk", "1995-08-02", "M", "fabio@hotmail.com", "155.884.997.81", 2500.0, 3, 2, "2020");
-- ------------------------------------------------QUERYS --------------------------------------------------------------------

SELECT * FROM colaborador;
SELECT * FROM endereco;
SELECT * FROM setor;
SELECT * FROM unidade;
SELECT * FROM setor_unidade;

SELECT * FROM setor INNER JOIN colaborador ON setor.idSetor = colaborador.idSetor; 
-- MOSTRE todos os dados da tabela setor e da tabela colaborador

SELECT colaborador.nome, setor.nome, unidade.nome FROM colaborador
INNER JOIN setor ON setor.idSetor = colaborador.idSetor
INNER JOIN unidade ON unidade.idUnidade = colaborador.idUnidade;
-- MOSTRE nome do colaborador, do setor e da unidade

SELECT idColaborador, colaborador.nome, colaborador.idSetor, setor.nome, unidade.nome FROM colaborador
INNER JOIN setor ON setor.idSetor = colaborador.idSetor
INNER JOIN unidade ON unidade.idUnidade = colaborador.idUnidade
WHERE setor.nome IN ("instrutores");
 -- MOSTRE nome e id dos colaboradore, nome e id do setor e nome da unidade, filtre somente pelo setor "instrutores"
 
 SELECT idColaborador,  colaborador.nome,  dataNasc, unidade.nome FROM colaborador 
 INNER JOIN unidade ON unidade.idUnidade = colaborador.idUnidade 
 WHERE unidade.nome IN("Unidade Boa viagem") ORDER BY  (dataNasc) DESC;
 -- MOSTRE id, nome e data de nascimento do colaborador e o nome da unidade. Filtre pelo nome da unidade e coloque-os em ordem descendente da Data de Nascimento
 
 SELECT idColaborador, dataNasc, colaborador.nome AS nomeColaborador, unidade.idUnidade, unidade.nome  AS nomeUnidade FROM colaborador 
 INNER JOIN unidade ON unidade.idUnidade = colaborador.idUnidade WHERE MONTH(dataNasc) IN (MONTH(CURRENT_DATE()));
 -- MOSTRE nome e id do colaborador, nome e id da unidade, renomeei as colunas "nome" e filtre pelos trabalahadores cuja data de nasc seja o mes 02
 
 SELECT idColaborador, colaborador.nome AS nomeColaborador, email, dataNasc, unidade.nome AS nomeUnidade, unidade.idUnidade, setor.nome AS nomeSetor FROM colaborador 
 INNER JOIN setor ON setor.idSetor = colaborador.idSetor
 INNER JOIN unidade ON unidade.idUnidade = colaborador.idUnidade
 WHERE  email LIKE ("%@outlook.com") ORDER BY (idcolaborador);
 -- MOSTRE id, nome, email e data de nascimento de colaborador, nome e id da unidade e nome do setor e filtre pelo final do email ordenando pelo id do colaborador  ordenando pelo id do colaborador
 
 SELECT idColaborador, colaborador.nome, sobrenome, ultimoNome, formacao, setor.nome FROM colaborador 
 INNER JOIN setor ON setor.idSetor = colaborador.idSetor 
 WHERE sobrenome IS NULL ORDER BY (colaborador.nome) DESC;
 -- MOSTRE id, nome, sobrenome, ultimo nome e formacao do colaborador, nome do setor e filtre pelo sobrenome cujo valor é nulo e ordene pelo nome do colaborador de forma descendente.
 
 SELECT idColaborador, colaborador.nome, unidade.idUnidade, unidade.nome, setor.idSetor, setor.nome, anoAdmissao FROM colaborador 
 INNER JOIN unidade ON unidade.idUnidade = colaborador.idUnidade
 INNER JOIN setor ON setor.idSetor = colaborador.idSetor WHERE anoAdmissao < 2020;
 
 
 