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
    instance = new Api.BriefOrderItemDTO();
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

  describe('BriefOrderItemDTO', function() {
    it('should create an instance of BriefOrderItemDTO', function() {
      // uncomment below and update the code to test BriefOrderItemDTO
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be.a(Api.BriefOrderItemDTO);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

    it('should have the property vat (base name: "vat")', function() {
      // uncomment below and update the code to test the property vat
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

    it('should have the property count (base name: "count")', function() {
      // uncomment below and update the code to test the property count
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

    it('should have the property offerName (base name: "offerName")', function() {
      // uncomment below and update the code to test the property offerName
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

    it('should have the property offerId (base name: "offerId")', function() {
      // uncomment below and update the code to test the property offerId
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

    it('should have the property instances (base name: "instances")', function() {
      // uncomment below and update the code to test the property instances
      //var instance = new Api.BriefOrderItemDTO();
      //expect(instance).to.be();
    });

  });

}));
