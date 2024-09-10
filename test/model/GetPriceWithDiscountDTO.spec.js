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
    instance = new Api.GetPriceWithDiscountDTO();
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

  describe('GetPriceWithDiscountDTO', function() {
    it('should create an instance of GetPriceWithDiscountDTO', function() {
      // uncomment below and update the code to test GetPriceWithDiscountDTO
      //var instance = new Api.GetPriceWithDiscountDTO();
      //expect(instance).to.be.a(Api.GetPriceWithDiscountDTO);
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instance = new Api.GetPriceWithDiscountDTO();
      //expect(instance).to.be();
    });

    it('should have the property currencyId (base name: "currencyId")', function() {
      // uncomment below and update the code to test the property currencyId
      //var instance = new Api.GetPriceWithDiscountDTO();
      //expect(instance).to.be();
    });

    it('should have the property discountBase (base name: "discountBase")', function() {
      // uncomment below and update the code to test the property discountBase
      //var instance = new Api.GetPriceWithDiscountDTO();
      //expect(instance).to.be();
    });

    it('should have the property updatedAt (base name: "updatedAt")', function() {
      // uncomment below and update the code to test the property updatedAt
      //var instance = new Api.GetPriceWithDiscountDTO();
      //expect(instance).to.be();
    });

  });

}));
