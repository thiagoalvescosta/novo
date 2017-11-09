(function() {
  'use strict';

  this.cronapi = {};

   /**
   * @categoryName Minhas Funções33
   */
  this.cronapi.myfunctions = {};
  
  /**
   * @type function
   * @name Nova Função333
   * @description Descrição da Função333
   * @multilayer false
   * @param {ObjectType.STRING} input Param Description
   * @returns {ObjectType.STRING}
   */
  this.cronapi.myfunctions.novaFuncao33 = function(/** @type {ObjectType.STRING} @description Parâmetro: Descrição do parâmetro */input) {
    return "INPUT" + input;
  };
  

}).bind(window)();