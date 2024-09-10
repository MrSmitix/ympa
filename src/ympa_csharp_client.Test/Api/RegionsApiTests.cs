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
    ///  Class for testing RegionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RegionsApiTests : IDisposable
    {
        private RegionsApi instance;

        public RegionsApiTests()
        {
            instance = new RegionsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RegionsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' RegionsApi
            //Assert.IsType<RegionsApi>(instance);
        }

        /// <summary>
        /// Test SearchRegionChildren
        /// </summary>
        [Fact]
        public void SearchRegionChildrenTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long regionId = null;
            //int? page = null;
            //int? pageSize = null;
            //var response = instance.SearchRegionChildren(regionId, page, pageSize);
            //Assert.IsType<GetRegionWithChildrenResponse>(response);
        }

        /// <summary>
        /// Test SearchRegionsById
        /// </summary>
        [Fact]
        public void SearchRegionsByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long regionId = null;
            //var response = instance.SearchRegionsById(regionId);
            //Assert.IsType<GetRegionsResponse>(response);
        }

        /// <summary>
        /// Test SearchRegionsByName
        /// </summary>
        [Fact]
        public void SearchRegionsByNameTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string name = null;
            //string? pageToken = null;
            //int? limit = null;
            //var response = instance.SearchRegionsByName(name, pageToken, limit);
            //Assert.IsType<GetRegionsResponse>(response);
        }
    }
}
