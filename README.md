# 🎓 Sistema de Gestão Escolar — Atividade Individual

Este projeto consiste na modelagem e implementação de um sistema em Java para o cadastro de **Pessoas** em uma escola, abrangendo **Alunos** e **Funcionários** com suas respectivas informações e regras de negócio.

## 📋 Descrição

O sistema é orientado a objetos e utiliza herança para representar as entidades `Pessoa`, `Aluno` e `Funcionario`. Cada classe possui atributos privados, métodos públicos e construtores com validações de regras de negócio.

---

## 🧱 Estrutura de Classes

### 🔹 Pessoa (Superclasse)
- **Atributos privados**:
  - `nome`
  - `cpf`
  - `dataNascimento`
- **Método público**:
  - `exibirDados()`
- **Regras de negócio**:
  - CPF não pode ser vazio (validado no construtor).
- **Encapsulamento**:
  - Todos os atributos são privados.
  - Acesso somente via métodos públicos.

---

### 🔸 Aluno (subclasse de Pessoa)
- **Atributos privados**:
  - `matriculaAluno`
  - `serie`
- **Método público**:
  - `exibirDadosCompletos()` — exibe dados da superclasse + matrícula e série.
- **Regras de negócio**:
  - Matrícula do aluno não pode ser vazia.
- **Herança**:
  - Usa `super(...)` para inicializar os atributos herdados no construtor.

---

### 🔸 Funcionario (subclasse de Pessoa)
- **Atributos privados**:
  - `matriculaFuncional`
  - `cargo`
  - `salario`
- **Método público**:
  - `exibirDadosCompletos()` — exibe dados da superclasse + informações funcionais.
- **Regras de negócio**:
  - Salário deve ser maior que 0.
- **Herança**:
  - Usa `super(...)` no construtor para inicializar os dados herdados.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança
- Encapsulamento
- Validação de regras de negócio nos construtores

---

## 🚀 Execução

Compile e execute o projeto com:

```bash
javac src/*.java
java -cp src Main
```

(Substitua Main pelo nome da sua classe principal de teste, se for diferente.)

✅ Requisitos Obrigatórios Atendidos
 Herança entre classes

 Encapsulamento completo

 Construtores com validação

 Métodos públicos para exibir dados

 Uso obrigatório de super(...)

Feito com 💻 para fins acadêmicos.
