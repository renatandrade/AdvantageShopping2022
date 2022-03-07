# encoding: utf-8
Feature: Consultar Produtos, adicionar um produto no carrinho e fazer logout

  @0003
  Scenario: Consultar Produtos, adicionar um produto no carrinho e fazer logout
   Given estou na home do Adventure Shopping
    When clico no botao de usuario
    And preencho login de usuario
    And preencho senha para logar
    And efetuo o login clicando no botao Sign in
    When na pagina home ja logada clico em our products
    And clico na categoria laptops
    And clico na imagem do laptop hp g1 es
    And clico no botao add to cart
    And clico no botao do menuCart
    Then valido que o produto foi adicionado no carrinho
    And clico no botao de usuario
    Then efetuo o logout
