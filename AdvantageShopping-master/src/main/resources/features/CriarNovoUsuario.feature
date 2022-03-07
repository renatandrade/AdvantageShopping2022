# encoding: utf-8
Feature: Feature Criar um novo usuario

@0001
  Scenario: Criar um novo usuario
  	Given estou na home do Adventure Shopping
  	When clico no botao de usuario
  	And clico no botao de criar novo usuario
  	And preencho o nome de usuario
  	And preencho o e-mail 
  	And preencho a senha 
  	And confirmo a senha 
  	And preencho o primeiro nome 
  	And preencho o sobrenome
  	And preencho o numero do telefone 
  	And seleciono o pais 
  	And preencho a cidade 
  	And preencho o endereco 
  	And preencho o estado 
  	And preencho o codigo postal 
  	And clico em i agree
  	Then clico no botao register 
  