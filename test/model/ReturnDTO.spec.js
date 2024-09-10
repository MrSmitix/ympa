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
    instance = new Api.ReturnDTO();
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

  describe('ReturnDTO', function() {
    it('should create an instance of ReturnDTO', function() {
      // uncomment below and update the code to test ReturnDTO
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be.a(Api.ReturnDTO);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property orderId (base name: "orderId")', function() {
      // uncomment below and update the code to test the property orderId
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property creationDate (base name: "creationDate")', function() {
      // uncomment below and update the code to test the property creationDate
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "updateDate")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property refundStatus (base name: "refundStatus")', function() {
      // uncomment below and update the code to test the property refundStatus
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property logisticPickupPoint (base name: "logisticPickupPoint")', function() {
      // uncomment below and update the code to test the property logisticPickupPoint
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property shipmentRecipientType (base name: "shipmentRecipientType")', function() {
      // uncomment below and update the code to test the property shipmentRecipientType
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property shipmentStatus (base name: "shipmentStatus")', function() {
      // uncomment below and update the code to test the property shipmentStatus
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property refundAmount (base name: "refundAmount")', function() {
      // uncomment below and update the code to test the property refundAmount
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property items (base name: "items")', function() {
      // uncomment below and update the code to test the property items
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property returnType (base name: "returnType")', function() {
      // uncomment below and update the code to test the property returnType
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

    it('should have the property fastReturn (base name: "fastReturn")', function() {
      // uncomment below and update the code to test the property fastReturn
      //var instance = new Api.ReturnDTO();
      //expect(instance).to.be();
    });

  });

}));
