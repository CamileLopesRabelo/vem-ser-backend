db.clientes.insertOne({
  "_id":1, 
  "nome": "Bianca Marostica",
  "telefone": [{"fixo": 5134625364, "celular": 51998736462}],
  "email": "biancamarostica@dbccompany.com.br",
  "status": "ativo",
  "tipo": "premium",
  "pontos_fidelidade": 500, 
  "emprestimo": [{"livro": "Harry Potter e a Pedra Filosofal", "Autor": "J.K. Rowling", "funcionario": "Juvenal Juvencio"} ] 
})

db.clientes.insertMany([
 {"_id":1, 
 "nome": "Bianca Marostica",
 "telefone": [{"fixo": 5134625364, "celular": 51998736462}],
 "email": "biancamarostica@dbccompany.com.br",
 "status": "ativo",
 "tipo": "premium",
 "pontos_fidelidade": 500, 
 "emprestimo": [{"livro": "Harry Potter e a Pedra Filosofal", "Autor": "J.K. Rowling", "funcionario": "Juvenal Juvencio"} ]},
{"_id":2, 
 "nome": "Camile Lopes",
 "telefone": [{"fixo": 8534657483, "celular": 8599887276252}],
 "email": "camile.oliveira@dbccompany.com.br",
 "status": "ativo",
 "tipo": "premium",
 "pontos_fidelidade": 200, 
 "emprestimo": [{"livro": "Harry Potter e o Enigma do Principe", "Autor": "J.K. Rowling", "funcionario": "Florentina de Jesus"} ]},
 {"_id":3, 
 "nome": "Davi Sales",
 "telefone": [{"fixo": 6347847564, "celular": 63748594858}],
 "email": "davi.sales@dbccompany.com.br",
 "status": "ativo",
 "tipo": "comum",
 "pontos_fidelidade": 400, 
 "emprestimo": [{"livro": "Todas as mãos reveladas", "Autor": "Gus Hansen", "funcionario": "Juvenal Juvencio"} ]}
])

---sort by nome----
db.clientes.find({status: "ativo"}).sort("nome")

{ _id: 1,
  nome: 'Bianca Marostica',
  telefone: [ { fixo: 5134625364, celular: 51998736462 } ],
  email: 'biancamarostica@dbccompany.com.br',
  status: 'ativo',
  tipo: 'premium',
  pontos_fidelidade: 500,
  emprestimo: 
   [ { livro: 'Harry Potter e a Pedra Filosofal',
       Autor: 'J.K. Rowling',
       funcionario: 'Juvenal Juvencio' } ] }
{ _id: 2,
  nome: 'Camile Lopes',
  telefone: [ { fixo: 8534657483, celular: 8599887276252 } ],
  email: 'camile.oliveira@dbccompany.com.br',
  status: 'ativo',
  tipo: 'premium',
  pontos_fidelidade: 200,
  emprestimo: 
   [ { livro: 'Harry Potter e o Enigma do Principe',
       Autor: 'J.K. Rowling',
       funcionario: 'Florentina de Jesus' } ] }
{ _id: 3,
  nome: 'Davi Sales',
  telefone: [ { fixo: 6347847564, celular: 63748594858 } ],
  email: 'davi.sales@dbccompany.com.br',
  status: 'ativo',
  tipo: 'comum',
  pontos_fidelidade: 400,
  emprestimo: 
   [ { livro: 'Todas as mãos reveladas',
       Autor: 'Gus Hansen',
       funcionario: 'Juvenal Juvencio' } ] }

--sort by pontos_ fidelidade--       

db.clientes.find({tipo: "premium"}).sort("pontos_fidelidade")

{ _id: 2,
  nome: 'Camile Lopes',
  telefone: [ { fixo: 8534657483, celular: 8599887276252 } ],
  email: 'camile.oliveira@dbccompany.com.br',
  status: 'ativo',
  tipo: 'premium',
  pontos_fidelidade: 200,
  emprestimo: 
   [ { livro: 'Harry Potter e o Enigma do Principe',
       Autor: 'J.K. Rowling',
       funcionario: 'Florentina de Jesus' } ] }
{ _id: 1,
  nome: 'Bianca Marostica',
  telefone: [ { fixo: 5134625364, celular: 51998736462 } ],
  email: 'biancamarostica@dbccompany.com.br',
  status: 'ativo',
  tipo: 'premium',
  pontos_fidelidade: 500,
  emprestimo: 
   [ { livro: 'Harry Potter e a Pedra Filosofal',
       Autor: 'J.K. Rowling',
       funcionario: 'Juvenal Juvencio' } ] }

--sort crescente e decrescente---

db.clientes.find({ }).sort( { pontos_fidelidade : 1} )
db.clientes.find({ }).sort( { pontos_fidelidade : -1} 
db.clientes.find({ }).sort( { _id: -1 } )

---- Find Limite

db.clientes.find({ status: "ativo" }).sort( { _id : -1 } ).limit(2)

{ _id: 3,
  nome: 'Davi Sales',
  telefone: [ { fixo: 6347847564, celular: 63748594858 } ],
  email: 'davi.sales@dbccompany.com.br',
  status: 'ativo',
  tipo: 'comum',
  pontos_fidelidade: 400,
  emprestimo: 
   [ { livro: 'Todas as mãos reveladas',
       Autor: 'Gus Hansen',
       funcionario: 'Juvenal Juvencio' } ] }
{ _id: 2,
  nome: 'Camile Lopes',
  telefone: [ { fixo: 8534657483, celular: 8599887276252 } ],
  email: 'camile.oliveira@dbccompany.com.br',
  status: 'ativo',
  tipo: 'premium',
  pontos_fidelidade: 200,
  emprestimo: 
   [ { livro: 'Harry Potter e o Enigma do Principe',
       Autor: 'J.K. Rowling',
       funcionario: 'Florentina de Jesus' } ] }

---- Find Array
// Busca nos elementos do array

db.clientes.find({"emprestimo.livro": "Harry Potter e a Pedra Filosofal"})

{ _id: 1,
  nome: 'Bianca Marostica',
  telefone: [ { fixo: 5134625364, celular: 51998736462 } ],
  email: 'biancamarostica@dbccompany.com.br',
  status: 'ativo',
  tipo: 'premium',
  pontos_fidelidade: 500,
  emprestimo: 
   [ { livro: 'Harry Potter e a Pedra Filosofal',
       Autor: 'J.K. Rowling',
       funcionario: 'Juvenal Juvencio' } ] }

// Na ordem exata
db.livros.find( { cor: ["branco", "preto"] } )

{ _id: ObjectId("619ec36da32e1d5ce1552cd0"),
  id_livro: 1,
  titulo: 'Harry Potter e a Pedra Filosofal',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 223,
  formato: '1',
  idioma: '1',
  status_livro: '0',
  cor: [ 'branco', 'preto' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd1"),
  id_livro: 3,
  titulo: 'Harry Potter e o Prisioneiro de Azkaban',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 317,
  formato: '1',
  idioma: '1',
  status_livro: '1',
  cor: [ 'branco', 'preto' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd2"),
  id_livro: 2,
  titulo: 'Harry Potter e a Camâra Secreta',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 251,
  formato: '1',
  idioma: '1',
  status_livro: '0',
  cor: [ 'branco', 'preto' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd5"),
  id_livro: 4,
  titulo: 'Harry Potter e o Cálice de Fogo',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 636,
  formato: '1',
  idioma: '1',
  status_livro: '0',
  cor: [ 'branco', 'preto' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd6"),
  id_livro: 5,
  titulo: 'Harry Potter e a Ordem Da Fênix',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 766,
  formato: '1',
  idioma: '1',
  status_livro: '0',
  cor: [ 'branco', 'preto' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd7"),
  id_livro: 6,
  titulo: 'Harry Potter e o Enigma do principe',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 471,
  formato: '1',
  idioma: '1',
  status_livro: '0',
  cor: [ 'branco', 'preto' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd8"),
  id_livro: 7,
  titulo: 'Harry Potter e as Relíquias da Morte',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 551,
  formato: '1',
  idioma: '1',
  status_livro: '0',
  cor: [ 'branco', 'preto' ] }

  db.livros.find( { cor: ["verde","preto", "marrom"] } )

{ _id: ObjectId("619ec36da32e1d5ce1552ccc"),
  id_livro: 12,
  titulo: 'Todas as Mãos Reveladas',
  autor: 'Gus Hansen',
  editora: 'Raise Editora',
  nr_paginas: 373,
  formato: '0',
  idioma: '0',
  status_livro: '0',
  cor: [ 'verde', 'preto', 'marrom' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552ccd"),
  id_livro: 14,
  titulo: '52 dicas para No-limit Texas Hold\'em',
  autor: 'Barry Shulman',
  editora: 'Raise Editora',
  nr_paginas: 143,
  formato: '0',
  idioma: '0',
  status_livro: '0',
  cor: [ 'verde', 'preto', 'marrom' ] }
{ _id: ObjectId("619ec36da32e1d5ce1552cd4"),
  id_livro: 13,
  titulo: 'Harrington no Hold\'em Volume 1 - Jogo Estratégico',
  autor: 'Dan Harrington',
  editora: 'Raise Editora',
  nr_paginas: 376,
  formato: '0',
  idioma: '0',
  status_livro: '1',
  cor: [ 'verde', 'preto', 'marrom' ] }

// Contém

db.livros.find( { cor: "cinza" } )

{ _id: ObjectId("619ec36da32e1d5ce1552ccf"),
  id_livro: 15,
  titulo: 'O Livro Verde do Pôquer',
  autor: 'Phil Gordon',
  editora: 'Marco Zero',
  nr_paginas: 218,
  formato: '0',
  idioma: '0',
  status_livro: '0',
  cor: [ 'branco', 'cinza' ] }

// Usando índice do array, segundo elemento = cinza

db.livros.find( { "cor.1": "cinza" } )

{ _id: ObjectId("619ec36da32e1d5ce1552ccf"),
  id_livro: 15,
  titulo: 'O Livro Verde do Pôquer',
  autor: 'Phil Gordon',
  editora: 'Marco Zero',
  nr_paginas: 218,
  formato: '0',
  idioma: '0',
  status_livro: '0',
  cor: [ 'branco', 'cinza' ] }

  // Tamanho
db.livros.find( { "cor": { $size: 1 } } )

{ _id: ObjectId("619ec36da32e1d5ce1552cd3"),
  id_livro: 16,
  titulo: 'Aquele Livro',
  autor: 'Fulano de Tal',
  editora: 'Globo',
  nr_paginas: 500,
  formato: '0',
  idioma: '0',
  status_livro: '0',
  cor: [ 'laranja' ] }

  ---- Projections

db.livros.find( {}, { _id: 0, titulo: 1, autor: 1 } )

{ titulo: 'Todas as Mãos Reveladas', autor: 'Gus Hansen' }
{ titulo: '52 dicas para No-limit Texas Hold\'em',autor: 'Barry Shulman' }
{ titulo: 'Battle Royale', autor: 'Koushun Takami' }
{ titulo: 'O Livro Verde do Pôquer', autor: 'Phil Gordon' }
{ titulo: 'Harry Potter e a Pedra Filosofal',autor: 'J.K. Rowling' }
{ titulo: 'Harry Potter e o Prisioneiro de Azkaban',autor: 'J.K. Rowling' }
{ titulo: 'Harry Potter e a Camâra Secreta',autor: 'J.K. Rowling' }
{ titulo: 'Aquele Livro', autor: 'Fulano de Tal' }
{ titulo: 'Harrington no Hold\'em Volume 1 - Jogo Estratégico',autor: 'Dan Harrington' }
{ titulo: 'Harry Potter e o Cálice de Fogo',autor: 'J.K. Rowling' }
{ titulo: 'Harry Potter e a Ordem Da Fênix',autor: 'J.K. Rowling' }
{ titulo: 'Harry Potter e o Enigma do principe',autor: 'J.K. Rowling' }
{ titulo: 'Harry Potter e as Relíquias da Morte',autor: 'J.K. Rowling' }

---- Aggregate
db.clientes.aggregate( [
   { $match: { tipo: "premium" } },
   { $group: { _id: "$status", sumQuantity: {$sum: "$pontos_fidelidade" }} }
] )

{ _id: 'ativo', sumQuantity: 700 }