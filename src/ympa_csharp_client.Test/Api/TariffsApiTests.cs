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
    ///  Class for testing TariffsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class TariffsApiTests : IDisposable
    {
        private TariffsApi instance;

        public TariffsApiTests()
        {
            instance = new TariffsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of TariffsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' TariffsApi
            //Assert.IsType<TariffsApi>(instance);
        }

        /// <summary>
        /// Test CalculateTariffs
        /// </summary>
        [Fact]
        public void CalculateTariffsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CalculateTariffsRequest calculateTariffsRequest = null;
            //var response = instance.CalculateTariffs(calculateTariffsRequest);
            //Assert.IsType<CalculateTariffsResponse>(response);
        }
    }
}
