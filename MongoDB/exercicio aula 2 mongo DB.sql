
-----Find equal

db.Livros.find({
  "nr_paginas": 143
})
{ _id: ObjectId("619c06044e5b8eddc41539db"),
  id_livro: 14,
  titulo: '52 dicas para No-limit Texas Hold\'em',
  autor: 'Barry Shulman',
  editora: 'Raise Editora',
  nr_paginas: 143,
  formato: '0',
  idioma: '0',
  status_livro: '0' }
  
  ----Find maior que
  
  db.Livros.find({
  nr_paginas:{$gt:600}
})
{ _id: ObjectId("619c06044e5b8eddc41539d4"),
  id_livro: 4,
  titulo: 'Harry Potter e o Cálice de Fogo',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 636,
  formato: '1',
  idioma: '1',
  status_livro: '0' }
{ _id: ObjectId("619c06044e5b8eddc41539d5"),
  id_livro: 5,
  titulo: 'Harry Potter e a Ordem Da Fênix',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 766,
  formato: '1',
  idioma: '1',
  status_livro: '0' }
  
  ----Find menor que
  
  db.Livros.find({
  nr_paginas: {$lt: 200}
})
{ _id: ObjectId("619c06044e5b8eddc41539db"),
  id_livro: 14,
  titulo: '52 dicas para No-limit Texas Hold\'em',
  autor: 'Barry Shulman',
  editora: 'Raise Editora',
  nr_paginas: 143,
  formato: '0',
  idioma: '0',
  status_livro: '0' }
  
----Find com in (contains)
  
  db.Livros.find({
  status_livro: {$in: ["1"]}
})
{ _id: ObjectId("619c06044e5b8eddc41539d3"),
  id_livro: 3,
  titulo: 'Harry Potter e o Prisioneiro de Azkaban',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 317,
  formato: '1',
  idioma: '1',
  status_livro: '1' }
{ _id: ObjectId("619c06044e5b8eddc41539da"),
  id_livro: 13,
  titulo: 'Harrington no Hold\'em Volume 1 - Jogo Estratégico',
  autor: 'Dan Harrington',
  editora: 'Raise Editora',
  nr_paginas: 376,
  formato: '0',
  idioma: '0',
  status_livro: '1' }
  
----Find aninhado
  
  db.alunos.find({
  "habilidades.nome" : "inglês"
})
{ _id: ObjectId("619bf7564e5b8eddc41539ce"),
  nome: 'João',
  data_nascimento: 1994-03-26T03:00:00.000Z,
  curso: { nome: 'Sistemas de informação' },
  notas: [ 10, 9, 4.5 ],
  habilidades: 
   [ { nome: 'inglês', 'nível': 'avançado' },
     { nome: 'taekwondo', 'nível': 'básico' } ] }
	 
	 
----UpdateOne

db.alunos.updateOne(
   { nome: "Camile Lopes" },
   {$set: { "nome": "Isys Oliveira"}})
{ acknowledged: true,
  insertedId: null,
  matchedCount: 1,
  modifiedCount: 1,
  upsertedCount: 0 }
  
----UpdateMany

db.Livros.updateMany(
   { idioma: "1" },
   {$set: { "idioma": "Português"}})
{ acknowledged: true,
  insertedId: null,
  matchedCount: 7,
  modifiedCount: 7,
  upsertedCount: 0 }
  
----DeleteOne
db.Livros.deleteOne({
  editora: "Marco Zero"
})
{ acknowledged: true, deletedCount: 1 }

---- Find Expressão

db.Livros.find({
    "titulo": /Harry/ 
})
{ _id: ObjectId("619c06044e5b8eddc41539d1"),
  id_livro: 1,
  titulo: 'Harry Potter e a Pedra Filosofal',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 223,
  formato: '1',
  idioma: 'Português',
  status_livro: '0' }
{ _id: ObjectId("619c06044e5b8eddc41539d2"),
  id_livro: 2,
  titulo: 'Harry Potter e a Camâra Secreta',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 251,
  formato: '1',
  idioma: 'Português',
  status_livro: '0' }
{ _id: ObjectId("619c06044e5b8eddc41539d3"),
  id_livro: 3,
  titulo: 'Harry Potter e o Prisioneiro de Azkaban',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 317,
  formato: '1',
  idioma: 'Português',
  status_livro: '1' }
{ _id: ObjectId("619c06044e5b8eddc41539d4"),
  id_livro: 4,
  titulo: 'Harry Potter e o Cálice de Fogo',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 636,
  formato: '1',
  idioma: 'Português',
  status_livro: '0' }
{ _id: ObjectId("619c06044e5b8eddc41539d5"),
  id_livro: 5,
  titulo: 'Harry Potter e a Ordem Da Fênix',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 766,
  formato: '1',
  idioma: 'Português',
  status_livro: '0' }
{ _id: ObjectId("619c06044e5b8eddc41539d6"),
  id_livro: 6,
  titulo: 'Harry Potter e o Enigma do principe',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 471,
  formato: '1',
  idioma: 'Português',
  status_livro: '0' }
{ _id: ObjectId("619c06044e5b8eddc41539d7"),
  id_livro: 7,
  titulo: 'Harry Potter e as Relíquias da Morte',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 551,
  formato: '1',
  idioma: 'Português',
  status_livro: '0' }

----Insert Many

db.clientes.insertMany([
  {
		"nome" : "Fulano da Silva",
		"telefone" : "61998998899",
		"email" : "fulano@gmail.com",
		"status_cliente" : "0",
		"tipo_cliente" : "0",
		"pontos_fidelidade" : 0
	},
	{
		"nome" : "Bianca Marostica",
		"telefone" : "519813251654",
		"email" : "bianca.marostica@dbccompany.com.br",
		"status_cliente" : "0",
		"tipo_cliente" : "1",
		"pontos_fidelidade" : 510
	},
	{
		"nome" : "Camile Lopes",
		"telefone" : "51935486546",
		"email" : "camilelopes.oliveira@gmail.com",
		"status_cliente" : "0",
		"tipo_cliente" : "1",
		"pontos_fidelidade" : 500
	},
	{
		"nome" : "David Salles",
		"telefone" : "61995579969",
		"email" : "davizaooo23@gmail.com",
		"status_cliente" : "0",
		"tipo_cliente" : "1",
		"pontos_fidelidade" : 1010
	}])
{ acknowledged: true,
  insertedIds: 
   { '0': ObjectId("619d477b08ae6145426da223"),
     '1': ObjectId("619d477b08ae6145426da224"),
     '2': ObjectId("619d477b08ae6145426da225"),
     '3': ObjectId("619d477b08ae6145426da226") } }
	 
	 
---- Find AND

db.clientes.find({
   "status_cliente": "0", "pontos_fidelidade": {$gt: 500}
})
{ _id: ObjectId("619d477b08ae6145426da224"),
  nome: 'Bianca Marostica',
  telefone: '519813251654',
  email: 'bianca.marostica@dbccompany.com.br',
  status_cliente: '0',
  tipo_cliente: '1',
  pontos_fidelidade: 510 }
{ _id: ObjectId("619d477b08ae6145426da226"),
  nome: 'David Salles',
  telefone: '61995579969',
  email: 'davizaooo23@gmail.com',
  status_cliente: '0',
  tipo_cliente: '1',
  pontos_fidelidade: 1010 }
  
---- Update One

db.clientes.updateOne(
  {nome:"Fulano da Silva"},
  {$set: {"nome": "Lucca Lopes Rabelo", "email": "lucca.lopes@gmail.com", "telefone": "85997490539"}}
)
{ acknowledged: true,
  insertedId: null,
  matchedCount: 1,
  modifiedCount: 1,
  upsertedCount: 0 }

---- Find Expressão

db.clientes.find({
    "nome": /Luc/ 
})
{ _id: ObjectId("619d477b08ae6145426da223"),
  nome: 'Lucca Lopes Rabelo',
  telefone: '85997490539',
  email: 'lucca.lopes@gmail.com',
  status_cliente: '0',
  tipo_cliente: '0',
  pontos_fidelidade: 0 }  
  
  