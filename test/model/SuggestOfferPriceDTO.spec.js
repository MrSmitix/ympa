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
    instance = new Api.SuggestOfferPriceDTO();
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

  describe('SuggestOfferPriceDTO', function() {
    it('should create an instance of SuggestOfferPriceDTO', function() {
      // uncomment below and update the code to test SuggestOfferPriceDTO
      //var instance = new Api.SuggestOfferPriceDTO();
      //expect(instance).to.be.a(Api.SuggestOfferPriceDTO);
    });

    it('should have the property offerId (base name: "offerId")', function() {
      // uncomment below and update the code to test the property offerId
      //var instance = new Api.SuggestOfferPriceDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketSku (base name: "marketSku")', function() {
      // uncomment below and update the code to test the property marketSku
      //var instance = new Api.SuggestOfferPriceDTO();
      //expect(instance).to.be();
    });

  });

}));
