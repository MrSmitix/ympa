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
    instance = new Api.EnrichedMappingsOfferDTO();
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

  describe('EnrichedMappingsOfferDTO', function() {
    it('should create an instance of EnrichedMappingsOfferDTO', function() {
      // uncomment below and update the code to test EnrichedMappingsOfferDTO
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be.a(Api.EnrichedMappingsOfferDTO);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property shopSku (base name: "shopSku")', function() {
      // uncomment below and update the code to test the property shopSku
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property category (base name: "category")', function() {
      // uncomment below and update the code to test the property category
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property vendor (base name: "vendor")', function() {
      // uncomment below and update the code to test the property vendor
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property vendorCode (base name: "vendorCode")', function() {
      // uncomment below and update the code to test the property vendorCode
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property feedId (base name: "feedId")', function() {
      // uncomment below and update the code to test the property feedId
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property barcodes (base name: "barcodes")', function() {
      // uncomment below and update the code to test the property barcodes
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property urls (base name: "urls")', function() {
      // uncomment below and update the code to test the property urls
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property pictures (base name: "pictures")', function() {
      // uncomment below and update the code to test the property pictures
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property manufacturer (base name: "manufacturer")', function() {
      // uncomment below and update the code to test the property manufacturer
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property manufacturerCountries (base name: "manufacturerCountries")', function() {
      // uncomment below and update the code to test the property manufacturerCountries
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property minShipment (base name: "minShipment")', function() {
      // uncomment below and update the code to test the property minShipment
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property transportUnitSize (base name: "transportUnitSize")', function() {
      // uncomment below and update the code to test the property transportUnitSize
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property quantumOfSupply (base name: "quantumOfSupply")', function() {
      // uncomment below and update the code to test the property quantumOfSupply
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property deliveryDurationDays (base name: "deliveryDurationDays")', function() {
      // uncomment below and update the code to test the property deliveryDurationDays
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property boxCount (base name: "boxCount")', function() {
      // uncomment below and update the code to test the property boxCount
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property customsCommodityCodes (base name: "customsCommodityCodes")', function() {
      // uncomment below and update the code to test the property customsCommodityCodes
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property weightDimensions (base name: "weightDimensions")', function() {
      // uncomment below and update the code to test the property weightDimensions
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property supplyScheduleDays (base name: "supplyScheduleDays")', function() {
      // uncomment below and update the code to test the property supplyScheduleDays
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property shelfLifeDays (base name: "shelfLifeDays")', function() {
      // uncomment below and update the code to test the property shelfLifeDays
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property lifeTimeDays (base name: "lifeTimeDays")', function() {
      // uncomment below and update the code to test the property lifeTimeDays
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property guaranteePeriodDays (base name: "guaranteePeriodDays")', function() {
      // uncomment below and update the code to test the property guaranteePeriodDays
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property processingState (base name: "processingState")', function() {
      // uncomment below and update the code to test the property processingState
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property availability (base name: "availability")', function() {
      // uncomment below and update the code to test the property availability
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property shelfLife (base name: "shelfLife")', function() {
      // uncomment below and update the code to test the property shelfLife
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property lifeTime (base name: "lifeTime")', function() {
      // uncomment below and update the code to test the property lifeTime
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property guaranteePeriod (base name: "guaranteePeriod")', function() {
      // uncomment below and update the code to test the property guaranteePeriod
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property certificate (base name: "certificate")', function() {
      // uncomment below and update the code to test the property certificate
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketCategoryId (base name: "marketCategoryId")', function() {
      // uncomment below and update the code to test the property marketCategoryId
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketCategoryName (base name: "marketCategoryName")', function() {
      // uncomment below and update the code to test the property marketCategoryName
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketModelId (base name: "marketModelId")', function() {
      // uncomment below and update the code to test the property marketModelId
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketModelName (base name: "marketModelName")', function() {
      // uncomment below and update the code to test the property marketModelName
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketSku (base name: "marketSku")', function() {
      // uncomment below and update the code to test the property marketSku
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketSkuName (base name: "marketSkuName")', function() {
      // uncomment below and update the code to test the property marketSkuName
      //var instance = new Api.EnrichedMappingsOfferDTO();
      //expect(instance).to.be();
    });

  });

}));
