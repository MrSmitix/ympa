/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.Api);
  }
}(this, function(expect, Api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Api.CalculateTariffsOfferInfoDTO();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CalculateTariffsOfferInfoDTO', function() {
    it('should create an instance of CalculateTariffsOfferInfoDTO', function() {
      // uncomment below and update the code to test CalculateTariffsOfferInfoDTO
      //var instance = new Api.CalculateTariffsOfferInfoDTO();
      //expect(instance).to.be.a(Api.CalculateTariffsOfferInfoDTO);
    });

    it('should have the property offer (base name: "offer")', function() {
      // uncomment below and update the code to test the property offer
      //var instance = new Api.CalculateTariffsOfferInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property tariffs (base name: "tariffs")', function() {
      // uncomment below and update the code to test the property tariffs
      //var instance = new Api.CalculateTariffsOfferInfoDTO();
      //expect(instance).to.be();
    });

  });

}));
