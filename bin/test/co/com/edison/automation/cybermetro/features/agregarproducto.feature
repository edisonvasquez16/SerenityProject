#Author: evasquez16.ev@gmail.com

Feature: Add Product
  As a User
  I want to use the form
  To add a product to the shopping cart

  Scenario Outline: Add product to the shopping cart
    Given Edison  Add product to the shopping cart
    When He search the product
    | <nombreProducto> |
    And He add the product
    And He go to shopping cart
    Then He verify the product in the shopping cart
    | <nombreProducto> | <numeroEjemplo> | 

    Examples: 
      | nombreProducto | numeroEjemplo  |
      | Papas Sabor BBQ Pringles Lata 124 g | 1 |
      #| Papas Pringles Original Lata 124 g | 2 |
      #| Cereal Chocapic Caja 400 g | 3 |
      #| Arroz Superior Metro Bolsa 5 kg | 4 |
