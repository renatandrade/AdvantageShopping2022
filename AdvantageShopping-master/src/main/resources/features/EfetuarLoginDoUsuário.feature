# encoding: utf-8
Feature: Efetuar o Login do usuario

  @0002
  Scenario: Efetuar o Login do usuario
    Given estou na home do Adventure Shopping
    When clico no botao de usuario
    And preencho login de usuario
    And preencho senha para logar
    Then efetuo o login clicando no botao Sign in