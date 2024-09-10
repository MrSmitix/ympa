/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using ympa_csharp_client.Client;
using ympa_csharp_client.Api;
// uncomment below to import models
//using ympa_csharp_client.Model;

namespace ympa_csharp_client.Test.Api
{
    /// <summary>
    ///  Class for testing BusinessesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class BusinessesApiTests : IDisposable
    {
        private BusinessesApi instance;

        public BusinessesApiTests()
        {
            instance = new BusinessesApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of BusinessesApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' BusinessesApi
            //Assert.IsType<BusinessesApi>(instance);
        }

        /// <summary>
        /// Test GetBusinessSettings
        /// </summary>
        [Fact]
        public void GetBusinessSettingsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long businessId = null;
            //var response = instance.GetBusinessSettings(businessId);
            //Assert.IsType<GetBusinessSettingsResponse>(response);
        }
    }
}
