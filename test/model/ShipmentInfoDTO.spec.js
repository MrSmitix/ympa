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
    instance = new Api.ShipmentInfoDTO();
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

  describe('ShipmentInfoDTO', function() {
    it('should create an instance of ShipmentInfoDTO', function() {
      // uncomment below and update the code to test ShipmentInfoDTO
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be.a(Api.ShipmentInfoDTO);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property planIntervalFrom (base name: "planIntervalFrom")', function() {
      // uncomment below and update the code to test the property planIntervalFrom
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property planIntervalTo (base name: "planIntervalTo")', function() {
      // uncomment below and update the code to test the property planIntervalTo
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property shipmentType (base name: "shipmentType")', function() {
      // uncomment below and update the code to test the property shipmentType
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property warehouse (base name: "warehouse")', function() {
      // uncomment below and update the code to test the property warehouse
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property warehouseTo (base name: "warehouseTo")', function() {
      // uncomment below and update the code to test the property warehouseTo
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property externalId (base name: "externalId")', function() {
      // uncomment below and update the code to test the property externalId
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property deliveryService (base name: "deliveryService")', function() {
      // uncomment below and update the code to test the property deliveryService
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property palletsCount (base name: "palletsCount")', function() {
      // uncomment below and update the code to test the property palletsCount
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property orderIds (base name: "orderIds")', function() {
      // uncomment below and update the code to test the property orderIds
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property draftCount (base name: "draftCount")', function() {
      // uncomment below and update the code to test the property draftCount
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property plannedCount (base name: "plannedCount")', function() {
      // uncomment below and update the code to test the property plannedCount
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property factCount (base name: "factCount")', function() {
      // uncomment below and update the code to test the property factCount
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property statusDescription (base name: "statusDescription")', function() {
      // uncomment below and update the code to test the property statusDescription
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

    it('should have the property statusUpdateTime (base name: "statusUpdateTime")', function() {
      // uncomment below and update the code to test the property statusUpdateTime
      //var instance = new Api.ShipmentInfoDTO();
      //expect(instance).to.be();
    });

  });

}));
