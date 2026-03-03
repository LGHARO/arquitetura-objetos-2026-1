# 🎵 Sistema de Streaming de Música - Modelagem OO

---

## 👤 Usuario

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `email : String`
- 🔸 `senha : String`
- 🔸 `dataCadastro : LocalDate`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `paisOrigem : String`
- 🔸 `assinatura : Assinatura`
- 🔸 `playlists : List<Playlist>`

### ⚙️ Métodos (Sugestão)
- 🔹 `assinarPlano(plano : Plano) : void`
- 🔹 `cancelarAssinatura() : void`
- 🔹 `criarPlaylist(nome : String) : Playlist`
- 🔹 `seguirArtista(artista : Artista) : void`
- 🔹 `reproduzirMusica(musica : Musica) : void`

---

## 💳 Assinatura

### 📌 Atributos
- 🔸 `dataInicio : LocalDate`
- 🔸 `dataFim : LocalDate`
- 🔸 `status : StatusAssinatura`
- 🔸 `renovacaoAutomatica : boolean`
- 🔸 `plano : Plano`

### ⚙️ Métodos (Sugestão)
- 🔹 `ativar() : void`
- 🔹 `cancelar() : void`
- 🔹 `renovar() : void`
- 🔹 `verificarStatus() : void`

---

## 📦 Plano

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `valorMensal : double`
- 🔸 `tipo : TipoPlano`
- 🔸 `limiteDispositivos : int`
- 🔸 `permiteDownload : boolean`

### ⚙️ Métodos (Sugestão)
- 🔹 `alterarValor(novoValor : double) : void`
- 🔹 `permiteMultiplosDispositivos() : boolean`

---

## 🎤 Artista

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataNascimento : LocalDate`
- 🔸 `paisOrigem : String`
- 🔸 `biografia : String`
- 🔸 `generoPrincipal : String`
- 🔸 `numeroSeguidores : long`
- 🔸 `verificado : boolean`
- 🔸 `albuns : List<Album>`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarAlbum(album : Album) : void`
- 🔹 `ganharSeguidores(qtd : int) : void`
- 🔹 `verificarConta() : void`

---

## 💿 Album

### 📌 Atributos
- 🔸 `titulo : String`
- 🔸 `dataLancamento : LocalDate`
- 🔸 `artista : Artista`
- 🔸 `musicas : List<Musica>`
- 🔸 `genero : String`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarMusica(musica : Musica) : void`
- 🔹 `calcularDuracaoTotal() : int`

---

## 🎵 Musica

### 📌 Atributos
- 🔸 `titulo : String`
- 🔸 `duracaoSegundos : int`
- 🔸 `numeroReproducoes : long`
- 🔸 `genero : String`
- 🔸 `dataLancamento : LocalDate`
- 🔸 `letra : String`
- 🔸 `artista : Artista`
- 🔸 `album : Album`

### ⚙️ Métodos (Sugestão)
- 🔹 `reproduzir() : void`
- 🔹 `curtir() : void`
- 🔹 `incrementarReproducoes() : void`

---

## 📂 Playlist

### 📌 Atributos
- 🔸 `nome : String`
- 🔸 `dataCriacao : LocalDate`
- 🔸 `publica : boolean`
- 🔸 `numeroSeguidores : long`
- 🔸 `descricao : String`
- 🔸 `musicas : List<Musica>`
- 🔸 `criador : Usuario`

### ⚙️ Métodos (Sugestão)
- 🔹 `adicionarMusica(musica : Musica) : void`
- 🔹 `removerMusica(musica : Musica) : void`
- 🔹 `ganharSeguidores(qtd : int) : void`
- 🔹 `calcularDuracaoTotal() : int`
