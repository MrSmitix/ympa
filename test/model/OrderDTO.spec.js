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
    instance = new Api.OrderDTO();
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

  describe('OrderDTO', function() {
    it('should create an instance of OrderDTO', function() {
      // uncomment below and update the code to test OrderDTO
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be.a(Api.OrderDTO);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property substatus (base name: "substatus")', function() {
      // uncomment below and update the code to test the property substatus
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property creationDate (base name: "creationDate")', function() {
      // uncomment below and update the code to test the property creationDate
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property updatedAt (base name: "updatedAt")', function() {
      // uncomment below and update the code to test the property updatedAt
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property currency (base name: "currency")', function() {
      // uncomment below and update the code to test the property currency
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property itemsTotal (base name: "itemsTotal")', function() {
      // uncomment below and update the code to test the property itemsTotal
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property deliveryTotal (base name: "deliveryTotal")', function() {
      // uncomment below and update the code to test the property deliveryTotal
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property buyerItemsTotal (base name: "buyerItemsTotal")', function() {
      // uncomment below and update the code to test the property buyerItemsTotal
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property buyerTotal (base name: "buyerTotal")', function() {
      // uncomment below and update the code to test the property buyerTotal
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property buyerItemsTotalBeforeDiscount (base name: "buyerItemsTotalBeforeDiscount")', function() {
      // uncomment below and update the code to test the property buyerItemsTotalBeforeDiscount
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property buyerTotalBeforeDiscount (base name: "buyerTotalBeforeDiscount")', function() {
      // uncomment below and update the code to test the property buyerTotalBeforeDiscount
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property paymentType (base name: "paymentType")', function() {
      // uncomment below and update the code to test the property paymentType
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property paymentMethod (base name: "paymentMethod")', function() {
      // uncomment below and update the code to test the property paymentMethod
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property fake (base name: "fake")', function() {
      // uncomment below and update the code to test the property fake
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property items (base name: "items")', function() {
      // uncomment below and update the code to test the property items
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property subsidies (base name: "subsidies")', function() {
      // uncomment below and update the code to test the property subsidies
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property delivery (base name: "delivery")', function() {
      // uncomment below and update the code to test the property delivery
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property buyer (base name: "buyer")', function() {
      // uncomment below and update the code to test the property buyer
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property notes (base name: "notes")', function() {
      // uncomment below and update the code to test the property notes
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property taxSystem (base name: "taxSystem")', function() {
      // uncomment below and update the code to test the property taxSystem
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property cancelRequested (base name: "cancelRequested")', function() {
      // uncomment below and update the code to test the property cancelRequested
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

    it('should have the property expiryDate (base name: "expiryDate")', function() {
      // uncomment below and update the code to test the property expiryDate
      //var instance = new Api.OrderDTO();
      //expect(instance).to.be();
    });

  });

}));
