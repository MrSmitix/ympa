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
    instance = new Api.ReturnInstanceDTO();
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

  describe('ReturnInstanceDTO', function() {
    it('should create an instance of ReturnInstanceDTO', function() {
      // uncomment below and update the code to test ReturnInstanceDTO
      //var instance = new Api.ReturnInstanceDTO();
      //expect(instance).to.be.a(Api.ReturnInstanceDTO);
    });

    it('should have the property stockType (base name: "stockType")', function() {
      // uncomment below and update the code to test the property stockType
      //var instance = new Api.ReturnInstanceDTO();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new Api.ReturnInstanceDTO();
      //expect(instance).to.be();
    });

    it('should have the property cis (base name: "cis")', function() {
      // uncomment below and update the code to test the property cis
      //var instance = new Api.ReturnInstanceDTO();
      //expect(instance).to.be();
    });

    it('should have the property imei (base name: "imei")', function() {
      // uncomment below and update the code to test the property imei
      //var instance = new Api.ReturnInstanceDTO();
      //expect(instance).to.be();
    });

  });

}));
