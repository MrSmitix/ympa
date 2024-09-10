using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace ympa_csharp_functions_server.Functions
{ 
    public partial class ReportsApi
    { 
        [FunctionName("ReportsApi_GenerateBoostConsolidatedReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateBoostConsolidatedReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/boost-consolidated/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateBoostConsolidatedReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateCompetitorsPositionReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateCompetitorsPositionReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/competitors-position/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateCompetitorsPositionReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateGoodsFeedbackReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateGoodsFeedbackReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/goods-feedback/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateGoodsFeedbackReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateGoodsMovementReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateGoodsMovementReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/goods-movement/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateGoodsMovementReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateGoodsRealizationReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateGoodsRealizationReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/goods-realization/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateGoodsRealizationReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateGoodsTurnoverReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateGoodsTurnoverReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/goods-turnover/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateGoodsTurnoverReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateMassOrderLabelsReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateMassOrderLabelsReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/documents/labels/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateMassOrderLabelsReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GeneratePricesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GeneratePricesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/prices/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GeneratePricesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateShelfsStatisticsReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateShelfsStatisticsReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/shelf-statistics/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateShelfsStatisticsReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateShipmentListDocumentReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateShipmentListDocumentReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/documents/shipment-list/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateShipmentListDocumentReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateShowsSalesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateShowsSalesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/shows-sales/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateShowsSalesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateStocksOnWarehousesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateStocksOnWarehousesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/stocks-on-warehouses/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateStocksOnWarehousesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateUnitedMarketplaceServicesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateUnitedMarketplaceServicesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/united-marketplace-services/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateUnitedMarketplaceServicesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateUnitedNettingReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateUnitedNettingReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/united-netting/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateUnitedNettingReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GenerateUnitedOrdersReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateUnitedOrdersReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/united-orders/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateUnitedOrdersReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportsApi_GetReportInfo")]
        public async Task<ActionResult<GetReportInfoResponse>> _GetReportInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "reports/info/{reportId}")]HttpRequest req, ExecutionContext context, string reportId)
        {
            var method = this.GetType().GetMethod("GetReportInfo");
            return method != null
                ? (await ((Task<GetReportInfoResponse>)method.Invoke(this, new object[] { req, context, reportId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
