CREATE TABLE VEM_SER.ESTUDANTE (
id_estudante NUMBER NOT NULL,
nome VARCHAR2(200) NOT NULL,
data_nascimento DATE NOT NULL,
num_matricula NUMBER UNIQUE NOT NULL,
ativo CHAR(1) NOT NULL
);

DROP TABLE VEM_SER.ESTUDANTE 


CREATE SEQUENCE VEM_SER.seq_estudante
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;


DROP SEQUENCE SEQ_ESTUDANTE
DROP SEQUENCE VEM_SER.seq_estudante;



INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO, NUM_MATRICULA, ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Camile Lopes', TO_DATE('11/06/1988', 'dd/mm/yyyy'),1,'S');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Amanda Silva', TO_DATE('15/04/1992', 'dd/mm/yyyy'),2,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Daiane dos Santos', TO_DATE('13/05/2001', 'dd/mm/yyyy'),3,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Luana Marques', TO_DATE('20/08/2000', 'dd/mm/yyyy'),4,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Marcelo Rodrigues', TO_DATE('15/04/1995', 'dd/mm/yyyy'),5,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Amanda Oliveira', TO_DATE('15/10/1992', 'dd/mm/yyyy'),6,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Lucas Matesuno', TO_DATE('15/03/2004', 'dd/mm/yyyy'),7,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Naami Sandre', TO_DATE('10/09/2009', 'dd/mm/yyyy'),8,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'kakaroto Goku', TO_DATE('15/04/1900', 'dd/mm/yyyy'),9,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Adamantes Benio', TO_DATE('28/02/2010', 'dd/mm/yyyy'),10,'N');

INSERT INTO VEM_SER.ESTUDANTE 
(ID_ESTUDANTE, NOME, DATA_NASCIMENTO,NUM_MATRICULA,ATIVO)
VALUES(VEM_SER.seq_estudante.nextval, 'Kirigaya kirito', TO_DATE('30/04/2005', 'dd/mm/yyyy'),11,'S');


UPDATE VEM_SER.ESTUDANTE 
SET ATIVO = 'S'
WHERE ID_ESTUDANTE >= 2 AND ID_ESTUDANTE <= 10



SELECT * FROM VEM_SER.ESTUDANTE