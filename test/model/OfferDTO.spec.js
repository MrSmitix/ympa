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
    instance = new Api.OfferDTO();
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

  describe('OfferDTO', function() {
    it('should create an instance of OfferDTO', function() {
      // uncomment below and update the code to test OfferDTO
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be.a(Api.OfferDTO);
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property feedId (base name: "feedId")', function() {
      // uncomment below and update the code to test the property feedId
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property shopCategoryId (base name: "shopCategoryId")', function() {
      // uncomment below and update the code to test the property shopCategoryId
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property marketCategoryId (base name: "marketCategoryId")', function() {
      // uncomment below and update the code to test the property marketCategoryId
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property preDiscountPrice (base name: "preDiscountPrice")', function() {
      // uncomment below and update the code to test the property preDiscountPrice
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property discount (base name: "discount")', function() {
      // uncomment below and update the code to test the property discount
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property cutPrice (base name: "cutPrice")', function() {
      // uncomment below and update the code to test the property cutPrice
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property modelId (base name: "modelId")', function() {
      // uncomment below and update the code to test the property modelId
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property currency (base name: "currency")', function() {
      // uncomment below and update the code to test the property currency
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property bid (base name: "bid")', function() {
      // uncomment below and update the code to test the property bid
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property cbid (base name: "cbid")', function() {
      // uncomment below and update the code to test the property cbid
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property fee (base name: "fee")', function() {
      // uncomment below and update the code to test the property fee
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

    it('should have the property blocked (base name: "blocked")', function() {
      // uncomment below and update the code to test the property blocked
      //var instance = new Api.OfferDTO();
      //expect(instance).to.be();
    });

  });

}));
