# GameHub System

Site de gerenciamento de games criado por André e Lucas Antônio

# GAMEHUB

Sistema de gerenciamento para biblioteca de jogos
Desenvolvido por André e Lucas Antônio

---

## Sobre o Projeto

O GameHub é um sistema criado para facilitar a organização e gerenciamento de jogos, permitindo controlar bibliotecas de games, categorias e usuários de forma simples e eficiente.

O objetivo é tornar a gestão de jogos mais organizada, prática e digital.

---

## Funcionalidades Principais

* Cadastro de jogos
* Organização por categorias e gêneros
* Controle de biblioteca de games
* Gerenciamento de usuários
* Painel administrativo

---

## Objetivo

Proporcionar uma solução intuitiva e funcional para organizar coleções de jogos, seja para uso pessoal, comunidades ou plataformas de games.

---

## Desenvolvedores

André
Lucas Antônio

---

## Status do Projeto

Em desenvolvimento

---

## Banco PG Admin
CREATE TABLE generos (
    id_genero INT PRIMARY KEY,
    nome_genero VARCHAR(100) NOT NULL,
    descricao_genero VARCHAR(255)
);

CREATE TABLE usuario (
    id_usuario INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha INT NOT NULL,
    data_cadastro DATE
);

CREATE TABLE jogos (
    id_jogo INT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descricao VARCHAR(255),
    desenvolvedor VARCHAR(150),
    ano_lancamento INT,
    id_genero INT,
    FOREIGN KEY (id_genero) REFERENCES generos(id_genero)
);

CREATE TABLE biblioteca_jogos (
    id_biblioteca INT PRIMARY KEY,
    id_usuario INT,
    id_jogo INT,
    status_jogo VARCHAR(50),
    data_adicionado DATE,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_jogo) REFERENCES jogos(id_jogo)
);

CREATE TABLE cadastros_jogos (
    id_cadastro INT PRIMARY KEY,
    id_usuario INT,
    id_jogo INT,
    data_cadastro DATE,
    responsavel VARCHAR(100),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_jogo) REFERENCES jogos(id_jogo)
);

---

## Excalidraw

<img width="810" height="498" alt="image" src="https://github.com/user-attachments/assets/b7e520d3-486e-4ef4-9678-0446847be978" />

---
