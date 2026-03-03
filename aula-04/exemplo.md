# 📚 Sistema Acadêmico - Modelagem OO

---

## 👨‍🎓 Aluno

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `cpf : String`
- 🔸 `ra : String`
- 🔸 `email : String`
- 🔸 `status : String (ATIVO, TRANCADO, FORMADO)`

### ⚙️ Métodos (Sugestão)
- 🔹 `mudarStatus(status : String) : String`
- 🔹 `calcularMediaGeral() : double`

---

## 📘 Curso

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `sigla : String`
- 🔸 `anoInicio : int`
- 🔸 `duracao : int`
- 🔸 `disciplinas : List<Disciplina>`
- 🔸 `coordenador : Coordenador`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarDisciplina(disciplina : Disciplina) : void`
- 🔹 `removerDisciplina(codigo : String) : void`
- 🔹 `definirCoordenador(coordenador : Coordenador) : void`

---

## 📝 Matricula

### 📌 Atributos
- 🔸 `aluno : Aluno`
- 🔸 `disciplina : Disciplina`
- 🔸 `nota : double`
- 🔸 `frequencia : double`
- 🔸 `dataMatricula : LocalDate`
- 🔸 `situacao : String (CURSANDO, APROVADO, REPROVADO, TRANCADO)`

### ⚙️ Métodos (Sugestão)
- 🔹 `registrarNota(nota : double) : void`
- 🔹 `registrarFrequencia(frequencia : double) : void`
- 🔹 `mudarSituacao(status : String) : String`

---

## 📖 Disciplina

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `ementa : String`
- 🔸 `codigo : String`
- 🔸 `cargaHoraria : int`
- 🔸 `professor : Professor`
- 🔸 `sala : Sala`

### ⚙️ Métodos (Sugestão)
- 🔹 `definirProfessor(professor : Professor) : void`
- 🔹 `definirSala(sala : Sala) : void`

---

## 👨‍🏫 Professor

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `dataContratacao : LocalDate`
- 🔸 `cpf : String`
- 🔸 `salario : double`
- 🔸 `email : String`
- 🔸 `disciplinas : List<Disciplina>`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarDisciplina(disciplina : Disciplina) : void`
- 🔹 `removerDisciplina(codigo : String) : void`

---

## 🏢 Coordenador

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `dataContratacao : LocalDate`
- 🔸 `cpf : String`
- 🔸 `salario : double`
- 🔸 `email : String`
- 🔸 `curso : Curso`

---

## 🏫 Sala

### 📌 Atributos
- 🔸 `numero : String`
- 🔸 `predio : String`
- 🔸 `tipo : TipoSala`

### ⚙️ Métodos (Sugestão)
- 🔹 `descricaoCompleta() : String`
