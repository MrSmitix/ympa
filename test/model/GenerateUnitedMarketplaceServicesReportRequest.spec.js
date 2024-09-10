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
    instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
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

  describe('GenerateUnitedMarketplaceServicesReportRequest', function() {
    it('should create an instance of GenerateUnitedMarketplaceServicesReportRequest', function() {
      // uncomment below and update the code to test GenerateUnitedMarketplaceServicesReportRequest
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be.a(Api.GenerateUnitedMarketplaceServicesReportRequest);
    });

    it('should have the property businessId (base name: "businessId")', function() {
      // uncomment below and update the code to test the property businessId
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property dateTimeFrom (base name: "dateTimeFrom")', function() {
      // uncomment below and update the code to test the property dateTimeFrom
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property dateTimeTo (base name: "dateTimeTo")', function() {
      // uncomment below and update the code to test the property dateTimeTo
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property dateFrom (base name: "dateFrom")', function() {
      // uncomment below and update the code to test the property dateFrom
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property dateTo (base name: "dateTo")', function() {
      // uncomment below and update the code to test the property dateTo
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property yearFrom (base name: "yearFrom")', function() {
      // uncomment below and update the code to test the property yearFrom
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property monthFrom (base name: "monthFrom")', function() {
      // uncomment below and update the code to test the property monthFrom
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property yearTo (base name: "yearTo")', function() {
      // uncomment below and update the code to test the property yearTo
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property monthTo (base name: "monthTo")', function() {
      // uncomment below and update the code to test the property monthTo
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property placementPrograms (base name: "placementPrograms")', function() {
      // uncomment below and update the code to test the property placementPrograms
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property inns (base name: "inns")', function() {
      // uncomment below and update the code to test the property inns
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

    it('should have the property campaignIds (base name: "campaignIds")', function() {
      // uncomment below and update the code to test the property campaignIds
      //var instance = new Api.GenerateUnitedMarketplaceServicesReportRequest();
      //expect(instance).to.be();
    });

  });

}));
