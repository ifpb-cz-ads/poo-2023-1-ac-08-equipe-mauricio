# 8.03 Atividade colaborativa

Atividades referentes a:

- Livro Batista e Moraes (2013): questões 3 até 8 (pág. 117);
- Livro Carvalho e Teixeira (2011): questões 1 e 2 (pág. 67).

#### (Questão 3 - BM ) Explique, com suas palavras, por que construtores de superclasses não são herdados por subclasses.

Subclasses não herdam os constrututores de suas superclasses, pois cada classe possui seu próprio método construtor e por isso o construtor da subclasse substitui o da sua superclasse. Contudo, o construtor da subclasse pode chamar o construtor da sua superclasse utilizando a palavra-chave super.