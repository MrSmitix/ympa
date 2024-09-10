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
    ///  Class for testing StocksApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class StocksApiTests : IDisposable
    {
        private StocksApi instance;

        public StocksApiTests()
        {
            instance = new StocksApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of StocksApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' StocksApi
            //Assert.IsType<StocksApi>(instance);
        }

        /// <summary>
        /// Test GetStocks
        /// </summary>
        [Fact]
        public void GetStocksTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long campaignId = null;
            //string? pageToken = null;
            //int? limit = null;
            //GetWarehouseStocksRequest? getWarehouseStocksRequest = null;
            //var response = instance.GetStocks(campaignId, pageToken, limit, getWarehouseStocksRequest);
            //Assert.IsType<GetWarehouseStocksResponse>(response);
        }

        /// <summary>
        /// Test UpdateStocks
        /// </summary>
        [Fact]
        public void UpdateStocksTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long campaignId = null;
            //UpdateStocksRequest updateStocksRequest = null;
            //var response = instance.UpdateStocks(campaignId, updateStocksRequest);
            //Assert.IsType<EmptyApiResponse>(response);
        }
    }
}
