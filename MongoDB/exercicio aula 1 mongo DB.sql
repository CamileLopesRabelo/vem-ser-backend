db.Livros.insertMany([
  	{
		"id_livro" : 1,
		"titulo" : "Harry Potter e a Pedra Filosofal",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 223,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "0"
	},
	{
		"id_livro" : 2,
		"titulo" : "Harry Potter e a Camâra Secreta",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 251,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "0"
	},
	{
		"id_livro" : 3,
		"titulo" : "Harry Potter e o Prisioneiro de Azkaban",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 317,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "1"
	},
	{
		"id_livro" : 4,
		"titulo" : "Harry Potter e o Cálice de Fogo",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 636,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "0"
	},
	{
		"id_livro" : 5,
		"titulo" : "Harry Potter e a Ordem Da Fênix",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 766,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "0"
	},
	{
		"id_livro" : 6,
		"titulo" : "Harry Potter e o Enigma do principe",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 471,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "0"
	},
	{
		"id_livro" : 7,
		"titulo" : "Harry Potter e as Relíquias da Morte",
		"autor" : "J.K. Rowling",
		"editora" : "Rocco",
		"nr_paginas" : 551,
		"formato" : "1",
		"idioma" : "1",
		"status_livro" : "0"
	},
	{
		"id_livro" : 11,
		"titulo" : "Battle Royale",
		"autor" : "Koushun Takami",
		"editora" : "Globo Livros",
		"nr_paginas" : 420,
		"formato" : "0",
		"idioma" : "0",
		"status_livro" : "0"
	},
	{
		"id_livro" : 12,
		"titulo" : "Todas as Mãos Reveladas",
		"autor" : "Gus Hansen",
		"editora" : "Raise Editora",
		"nr_paginas" : 373,
		"formato" : "0",
		"idioma" : "0",
		"status_livro" : "0"
	},
	{
		"id_livro" : 13,
		"titulo" : "Harrington no Hold'em Volume 1 - Jogo Estratégico",
		"autor" : "Dan Harrington",
		"editora" : "Raise Editora",
		"nr_paginas" : 376,
		"formato" : "0",
		"idioma" : "0",
		"status_livro" : "1"
	},
	{
		"id_livro" : 14,
		"titulo" : "52 dicas para No-limit Texas Hold'em",
		"autor" : "Barry Shulman",
		"editora" : "Raise Editora",
		"nr_paginas" : 143,
		"formato" : "0",
		"idioma" : "0",
		"status_livro" : "0"
	},
	{
		"id_livro" : 15,
		"titulo" : "O Livro Verde do Pôquer",
		"autor" : "Phil Gordon",
		"editora" : "Marco Zero",
		"nr_paginas" : 218,
		"formato" : "0",
		"idioma" : "0",
		"status_livro" : "0"
	},
	{
		"id_livro" : 16,
		"titulo" : "Aquele Livro",
		"autor" : "Fulano de Tal",
		"editora" : "Globo",
		"nr_paginas" : 500,
		"formato" : "0",
		"idioma" : "0",
		"status_livro" : "0"
	}
]);

db.Livros.find({titulo : "Harry Potter e a Pedra Filosofal"})
{ _id: ObjectId("619c06044e5b8eddc41539d1"),
  id_livro: 1,
  titulo: 'Harry Potter e a Pedra Filosofal',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 223,
  formato: '1',
  idioma: '1',
  status_livro: '0' }
  
  db.Livros.find({
  $or:[
       {titulo: "Harry Potter e a Camâra Secreta"},
       {nr_paginas: 766}
       ]
})
{ _id: ObjectId("619c06044e5b8eddc41539d2"),
  id_livro: 2,
  titulo: 'Harry Potter e a Camâra Secreta',
  autor: 'J.K. Rowling',
  editora: 'Rocco',
  nr_paginas: 251,
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
  
db.Livros.deleteOne({_id:ObjectId('619c06044e5b8eddc41539dd')})
{ acknowledged: true, deletedCount: 1 }
