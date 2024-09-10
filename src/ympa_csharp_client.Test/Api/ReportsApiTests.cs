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
    ///  Class for testing ReportsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ReportsApiTests : IDisposable
    {
        private ReportsApi instance;

        public ReportsApiTests()
        {
            instance = new ReportsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ReportsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ReportsApi
            //Assert.IsType<ReportsApi>(instance);
        }

        /// <summary>
        /// Test GenerateBoostConsolidatedReport
        /// </summary>
        [Fact]
        public void GenerateBoostConsolidatedReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateBoostConsolidatedReport(generateBoostConsolidatedRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateCompetitorsPositionReport
        /// </summary>
        [Fact]
        public void GenerateCompetitorsPositionReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateGoodsFeedbackReport
        /// </summary>
        [Fact]
        public void GenerateGoodsFeedbackReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateGoodsFeedbackReport(generateGoodsFeedbackRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateGoodsMovementReport
        /// </summary>
        [Fact]
        public void GenerateGoodsMovementReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateGoodsMovementReport(generateGoodsMovementReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateGoodsRealizationReport
        /// </summary>
        [Fact]
        public void GenerateGoodsRealizationReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateGoodsRealizationReport(generateGoodsRealizationReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateGoodsTurnoverReport
        /// </summary>
        [Fact]
        public void GenerateGoodsTurnoverReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateGoodsTurnoverReport(generateGoodsTurnoverRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateMassOrderLabelsReport
        /// </summary>
        [Fact]
        public void GenerateMassOrderLabelsReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = null;
            //PageFormatType? format = null;
            //var response = instance.GenerateMassOrderLabelsReport(generateMassOrderLabelsRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GeneratePricesReport
        /// </summary>
        [Fact]
        public void GeneratePricesReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GeneratePricesReportRequest generatePricesReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GeneratePricesReport(generatePricesReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateShelfsStatisticsReport
        /// </summary>
        [Fact]
        public void GenerateShelfsStatisticsReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateShelfsStatisticsReport(generateShelfsStatisticsRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateShipmentListDocumentReport
        /// </summary>
        [Fact]
        public void GenerateShipmentListDocumentReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = null;
            //var response = instance.GenerateShipmentListDocumentReport(generateShipmentListDocumentReportRequest);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateShowsSalesReport
        /// </summary>
        [Fact]
        public void GenerateShowsSalesReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateShowsSalesReportRequest generateShowsSalesReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateShowsSalesReport(generateShowsSalesReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateStocksOnWarehousesReport
        /// </summary>
        [Fact]
        public void GenerateStocksOnWarehousesReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateUnitedMarketplaceServicesReport
        /// </summary>
        [Fact]
        public void GenerateUnitedMarketplaceServicesReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateUnitedNettingReport
        /// </summary>
        [Fact]
        public void GenerateUnitedNettingReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateUnitedNettingReport(generateUnitedNettingReportRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GenerateUnitedOrdersReport
        /// </summary>
        [Fact]
        public void GenerateUnitedOrdersReportTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //GenerateUnitedOrdersRequest generateUnitedOrdersRequest = null;
            //ReportFormatType? format = null;
            //var response = instance.GenerateUnitedOrdersReport(generateUnitedOrdersRequest, format);
            //Assert.IsType<GenerateReportResponse>(response);
        }

        /// <summary>
        /// Test GetReportInfo
        /// </summary>
        [Fact]
        public void GetReportInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string reportId = null;
            //var response = instance.GetReportInfo(reportId);
            //Assert.IsType<GetReportInfoResponse>(response);
        }
    }
}
