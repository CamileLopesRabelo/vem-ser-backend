SELECT *
FROM PESSOA p
RIGHT OUTER JOIN CONTATO c ON (P.ID_PESSOA = C.ID_PESSOA)

SELECT p.nome, pxpe.*,ep.*
 	FROM PESSOA p 
 	RIGHT OUTER JOIN PESSOA_X_PESSOA_ENDERECO pxpe ON (p.ID_PESSOA = pxpe.ID_PESSOA)
 	RIGHT OUTER JOIN ENDERECO_PESSOA ep ON (PXPE.ID_ENDERECO = EP.ID_ENDERECO)
 	
 	
 SELECT *
 	FROM PESSOA p 
 	RIGHT OUTER JOIN CONTATO c ON (p.ID_PESSOA = c.ID_CONTATO)
 	RIGHT OUTER JOIN PESSOA_X_PESSOA_ENDERECO pxpe ON (p.ID_PESSOA = pxpe.ID_PESSOA)
 	RIGHT OUTER JOIN ENDERECO_PESSOA ep ON (pxpe.ID_ENDERECO = ep.ID_ENDERECO)
 	
 SELECT P.NOME,C.NUMERO
FROM PESSOA p
FULL JOIN CONTATO c ON (P.ID_PESSOA = C.ID_PESSOA)

SELECT *
	FROM PESSOA p 
 	FULL JOIN PESSOA_X_PESSOA_ENDERECO pxpe ON (p.ID_PESSOA = pxpe.ID_PESSOA)
 	FULL JOIN ENDERECO_PESSOA ep ON (PXPE.ID_ENDERECO = EP.ID_ENDERECO)



SELECT P .NOME ,P .CPF, c.NUMERO, c.DESCRICAO, ep.LOGRADOURO, ep.NUMERO, ep.COMPLEMENTO, ep.CIDADE 
FROM PESSOA p 
FULL JOIN CONTATO c ON (P.ID_PESSOA = C.ID_PESSOA)
FULL JOIN PESSOA_X_PESSOA_ENDERECO pxpe ON (P.ID_PESSOA = PXPE.ID_PESSOA)
FULL JOIN ENDERECO_PESSOA ep ON (PXPE.ID_ENDERECO = EP.ID_ENDERECO)

SELECT p.NOME
FROM PESSOA p 
WHERE EXISTS (
SELECT * 
FROM PESSOA p 
 	INNER JOIN PESSOA_X_PESSOA_ENDERECO pxpe ON (p.ID_PESSOA = pxpe.ID_PESSOA)
 	INNER JOIN ENDERECO_PESSOA ep ON (PXPE.ID_ENDERECO = EP.ID_ENDERECO)
)

SELECT ID_PESSOA,NOME
FROM PESSOA
UNION
SELECT ID_ENDERECO, LOGRADOURO
FROM ENDERECO_PESSOA





