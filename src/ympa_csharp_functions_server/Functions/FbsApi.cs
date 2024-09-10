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
    public partial class FbsApi
    { 
        [FunctionName("FbsApi_AddHiddenOffers")]
        public async Task<ActionResult<EmptyApiResponse>> _AddHiddenOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/hidden-offers")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("AddHiddenOffers");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_AddOffersToArchive")]
        public async Task<ActionResult<AddOffersToArchiveResponse>> _AddOffersToArchive([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/archive")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("AddOffersToArchive");
            return method != null
                ? (await ((Task<AddOffersToArchiveResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_CalculateTariffs")]
        public async Task<ActionResult<CalculateTariffsResponse>> _CalculateTariffs([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "tariffs/calculate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CalculateTariffs");
            return method != null
                ? (await ((Task<CalculateTariffsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_ConfirmBusinessPrices")]
        public async Task<ActionResult<EmptyApiResponse>> _ConfirmBusinessPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/price-quarantine/confirm")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("ConfirmBusinessPrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_ConfirmCampaignPrices")]
        public async Task<ActionResult<EmptyApiResponse>> _ConfirmCampaignPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/price-quarantine/confirm")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("ConfirmCampaignPrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_ConfirmShipment")]
        public async Task<ActionResult<EmptyApiResponse>> _ConfirmShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("ConfirmShipment");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_CreateChat")]
        public async Task<ActionResult<CreateChatResponse>> _CreateChat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/new")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("CreateChat");
            return method != null
                ? (await ((Task<CreateChatResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DeleteCampaignOffers")]
        public async Task<ActionResult<DeleteCampaignOffersResponse>> _DeleteCampaignOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offers/delete")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("DeleteCampaignOffers");
            return method != null
                ? (await ((Task<DeleteCampaignOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DeleteGoodsFeedbackComment")]
        public async Task<ActionResult<EmptyApiResponse>> _DeleteGoodsFeedbackComment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/comments/delete")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeleteGoodsFeedbackComment");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DeleteHiddenOffers")]
        public async Task<ActionResult<EmptyApiResponse>> _DeleteHiddenOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/hidden-offers/delete")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("DeleteHiddenOffers");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DeleteOffers")]
        public async Task<ActionResult<DeleteOffersResponse>> _DeleteOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/delete")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeleteOffers");
            return method != null
                ? (await ((Task<DeleteOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DeleteOffersFromArchive")]
        public async Task<ActionResult<DeleteOffersFromArchiveResponse>> _DeleteOffersFromArchive([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/unarchive")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeleteOffersFromArchive");
            return method != null
                ? (await ((Task<DeleteOffersFromArchiveResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DeletePromoOffers")]
        public async Task<ActionResult<DeletePromoOffersResponse>> _DeletePromoOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos/offers/delete")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeletePromoOffers");
            return method != null
                ? (await ((Task<DeletePromoOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DownloadShipmentAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DownloadShipmentDiscrepancyAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentDiscrepancyAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentDiscrepancyAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DownloadShipmentInboundAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentInboundAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentInboundAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DownloadShipmentPalletLabels")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentPalletLabels([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentPalletLabels");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DownloadShipmentReceptionTransferAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentReceptionTransferAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/shipments/reception-transfer-act")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentReceptionTransferAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_DownloadShipmentTransportationWaybill")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentTransportationWaybill([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentTransportationWaybill");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateBoostConsolidatedReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateBoostConsolidatedReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/boost-consolidated/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateBoostConsolidatedReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateCompetitorsPositionReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateCompetitorsPositionReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/competitors-position/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateCompetitorsPositionReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateGoodsFeedbackReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateGoodsFeedbackReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/goods-feedback/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateGoodsFeedbackReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateGoodsRealizationReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateGoodsRealizationReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/goods-realization/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateGoodsRealizationReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateMassOrderLabelsReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateMassOrderLabelsReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/documents/labels/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateMassOrderLabelsReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateOrderLabel")]
        public async Task<ActionResult<System.IO.Stream>> _GenerateOrderLabel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long shipmentId, long boxId)
        {
            var method = this.GetType().GetMethod("GenerateOrderLabel");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId, shipmentId, boxId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateOrderLabels")]
        public async Task<ActionResult<System.IO.Stream>> _GenerateOrderLabels([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/labels")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GenerateOrderLabels");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GeneratePricesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GeneratePricesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/prices/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GeneratePricesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateShelfsStatisticsReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateShelfsStatisticsReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/shelf-statistics/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateShelfsStatisticsReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateShipmentListDocumentReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateShipmentListDocumentReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/documents/shipment-list/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateShipmentListDocumentReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateShowsSalesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateShowsSalesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/shows-sales/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateShowsSalesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateStocksOnWarehousesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateStocksOnWarehousesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/stocks-on-warehouses/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateStocksOnWarehousesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateUnitedMarketplaceServicesReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateUnitedMarketplaceServicesReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/united-marketplace-services/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateUnitedMarketplaceServicesReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateUnitedNettingReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateUnitedNettingReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/united-netting/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateUnitedNettingReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GenerateUnitedOrdersReport")]
        public async Task<ActionResult<GenerateReportResponse>> _GenerateUnitedOrdersReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "reports/united-orders/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerateUnitedOrdersReport");
            return method != null
                ? (await ((Task<GenerateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetAllOffers")]
        public async Task<ActionResult<GetAllOffersResponse>> _GetAllOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/offers/all")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetAllOffers");
            return method != null
                ? (await ((Task<GetAllOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetBidsInfoForBusiness")]
        public async Task<ActionResult<GetBidsInfoResponse>> _GetBidsInfoForBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/bids/info")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBidsInfoForBusiness");
            return method != null
                ? (await ((Task<GetBidsInfoResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetBidsRecommendations")]
        public async Task<ActionResult<GetBidsRecommendationsResponse>> _GetBidsRecommendations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/bids/recommendations")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBidsRecommendations");
            return method != null
                ? (await ((Task<GetBidsRecommendationsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetBusinessQuarantineOffers")]
        public async Task<ActionResult<GetQuarantineOffersResponse>> _GetBusinessQuarantineOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/price-quarantine")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBusinessQuarantineOffers");
            return method != null
                ? (await ((Task<GetQuarantineOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetBusinessSettings")]
        public async Task<ActionResult<GetBusinessSettingsResponse>> _GetBusinessSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/settings")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBusinessSettings");
            return method != null
                ? (await ((Task<GetBusinessSettingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaign")]
        public async Task<ActionResult<GetCampaignResponse>> _GetCampaign([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaign");
            return method != null
                ? (await ((Task<GetCampaignResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaignLogins")]
        public async Task<ActionResult<GetCampaignLoginsResponse>> _GetCampaignLogins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/logins")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignLogins");
            return method != null
                ? (await ((Task<GetCampaignLoginsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaignOffers")]
        public async Task<ActionResult<GetCampaignOffersResponse>> _GetCampaignOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offers")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignOffers");
            return method != null
                ? (await ((Task<GetCampaignOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaignQuarantineOffers")]
        public async Task<ActionResult<GetQuarantineOffersResponse>> _GetCampaignQuarantineOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/price-quarantine")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignQuarantineOffers");
            return method != null
                ? (await ((Task<GetQuarantineOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaignRegion")]
        public async Task<ActionResult<GetCampaignRegionResponse>> _GetCampaignRegion([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/region")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignRegion");
            return method != null
                ? (await ((Task<GetCampaignRegionResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaignSettings")]
        public async Task<ActionResult<GetCampaignSettingsResponse>> _GetCampaignSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/settings")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignSettings");
            return method != null
                ? (await ((Task<GetCampaignSettingsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaigns")]
        public async Task<ActionResult<GetCampaignsResponse>> _GetCampaigns([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCampaigns");
            return method != null
                ? (await ((Task<GetCampaignsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCampaignsByLogin")]
        public async Task<ActionResult<GetCampaignsResponse>> _GetCampaignsByLogin([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/by_login/{login}")]HttpRequest req, ExecutionContext context, string login)
        {
            var method = this.GetType().GetMethod("GetCampaignsByLogin");
            return method != null
                ? (await ((Task<GetCampaignsResponse>)method.Invoke(this, new object[] { req, context, login })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCategoriesMaxSaleQuantum")]
        public async Task<ActionResult<GetCategoriesMaxSaleQuantumResponse>> _GetCategoriesMaxSaleQuantum([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "categories/max-sale-quantum")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCategoriesMaxSaleQuantum");
            return method != null
                ? (await ((Task<GetCategoriesMaxSaleQuantumResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCategoriesTree")]
        public async Task<ActionResult<GetCategoriesResponse>> _GetCategoriesTree([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "categories/tree")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCategoriesTree");
            return method != null
                ? (await ((Task<GetCategoriesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetCategoryContentParameters")]
        public async Task<ActionResult<GetCategoryContentParametersResponse>> _GetCategoryContentParameters([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "category/{categoryId}/parameters")]HttpRequest req, ExecutionContext context, long categoryId)
        {
            var method = this.GetType().GetMethod("GetCategoryContentParameters");
            return method != null
                ? (await ((Task<GetCategoryContentParametersResponse>)method.Invoke(this, new object[] { req, context, categoryId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetChatHistory")]
        public async Task<ActionResult<GetChatHistoryResponse>> _GetChatHistory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/history")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetChatHistory");
            return method != null
                ? (await ((Task<GetChatHistoryResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetChats")]
        public async Task<ActionResult<GetChatsResponse>> _GetChats([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetChats");
            return method != null
                ? (await ((Task<GetChatsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetDeliveryServices")]
        public async Task<ActionResult<GetDeliveryServicesResponse>> _GetDeliveryServices([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "delivery/services")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetDeliveryServices");
            return method != null
                ? (await ((Task<GetDeliveryServicesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetFeed")]
        public async Task<ActionResult<GetFeedResponse>> _GetFeed([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feeds/{feedId}")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("GetFeed");
            return method != null
                ? (await ((Task<GetFeedResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetFeedIndexLogs")]
        public async Task<ActionResult<GetFeedIndexLogsResponse>> _GetFeedIndexLogs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feeds/{feedId}/index-logs")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("GetFeedIndexLogs");
            return method != null
                ? (await ((Task<GetFeedIndexLogsResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetFeedbackAndCommentUpdates")]
        public async Task<ActionResult<GetFeedbackListResponse>> _GetFeedbackAndCommentUpdates([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feedback/updates")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetFeedbackAndCommentUpdates");
            return method != null
                ? (await ((Task<GetFeedbackListResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetFeeds")]
        public async Task<ActionResult<GetFeedsResponse>> _GetFeeds([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feeds")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetFeeds");
            return method != null
                ? (await ((Task<GetFeedsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetGoodsFeedbackComments")]
        public async Task<ActionResult<GetGoodsFeedbackCommentsResponse>> _GetGoodsFeedbackComments([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/comments")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetGoodsFeedbackComments");
            return method != null
                ? (await ((Task<GetGoodsFeedbackCommentsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetGoodsFeedbacks")]
        public async Task<ActionResult<GetGoodsFeedbackResponse>> _GetGoodsFeedbacks([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetGoodsFeedbacks");
            return method != null
                ? (await ((Task<GetGoodsFeedbackResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetGoodsStats")]
        public async Task<ActionResult<GetGoodsStatsResponse>> _GetGoodsStats([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/stats/skus")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetGoodsStats");
            return method != null
                ? (await ((Task<GetGoodsStatsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetHiddenOffers")]
        public async Task<ActionResult<GetHiddenOffersResponse>> _GetHiddenOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/hidden-offers")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetHiddenOffers");
            return method != null
                ? (await ((Task<GetHiddenOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOfferCardsContentStatus")]
        public async Task<ActionResult<GetOfferCardsContentStatusResponse>> _GetOfferCardsContentStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-cards")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetOfferCardsContentStatus");
            return method != null
                ? (await ((Task<GetOfferCardsContentStatusResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOfferMappingEntries")]
        public async Task<ActionResult<GetOfferMappingEntriesResponse>> _GetOfferMappingEntries([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/offer-mapping-entries")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOfferMappingEntries");
            return method != null
                ? (await ((Task<GetOfferMappingEntriesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOfferMappings")]
        public async Task<ActionResult<GetOfferMappingsResponse>> _GetOfferMappings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetOfferMappings");
            return method != null
                ? (await ((Task<GetOfferMappingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOfferRecommendations")]
        public async Task<ActionResult<GetOfferRecommendationsResponse>> _GetOfferRecommendations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offers/recommendations")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetOfferRecommendations");
            return method != null
                ? (await ((Task<GetOfferRecommendationsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOffers")]
        public async Task<ActionResult<GetOffersResponse>> _GetOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/offers")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOffers");
            return method != null
                ? (await ((Task<GetOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOrder")]
        public async Task<ActionResult<GetOrderResponse>> _GetOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrder");
            return method != null
                ? (await ((Task<GetOrderResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOrderBusinessBuyerInfo")]
        public async Task<ActionResult<GetBusinessBuyerInfoResponse>> _GetOrderBusinessBuyerInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/business-buyer")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrderBusinessBuyerInfo");
            return method != null
                ? (await ((Task<GetBusinessBuyerInfoResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOrderBusinessDocumentsInfo")]
        public async Task<ActionResult<GetBusinessDocumentsInfoResponse>> _GetOrderBusinessDocumentsInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/documents")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrderBusinessDocumentsInfo");
            return method != null
                ? (await ((Task<GetBusinessDocumentsInfoResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOrderLabelsData")]
        public async Task<ActionResult<GetOrderLabelsDataResponse>> _GetOrderLabelsData([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/labels/data")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrderLabelsData");
            return method != null
                ? (await ((Task<GetOrderLabelsDataResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOrders")]
        public async Task<ActionResult<GetOrdersResponse>> _GetOrders([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOrders");
            return method != null
                ? (await ((Task<GetOrdersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetOrdersStats")]
        public async Task<ActionResult<GetOrdersStatsResponse>> _GetOrdersStats([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/stats/orders")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOrdersStats");
            return method != null
                ? (await ((Task<GetOrdersStatsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetPrices")]
        public async Task<ActionResult<GetPricesResponse>> _GetPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/offer-prices")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetPrices");
            return method != null
                ? (await ((Task<GetPricesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetPricesByOfferIds")]
        public async Task<ActionResult<GetPricesByOfferIdsResponse>> _GetPricesByOfferIds([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-prices")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetPricesByOfferIds");
            return method != null
                ? (await ((Task<GetPricesByOfferIdsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetPromoOffers")]
        public async Task<ActionResult<GetPromoOffersResponse>> _GetPromoOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos/offers")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetPromoOffers");
            return method != null
                ? (await ((Task<GetPromoOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetPromos")]
        public async Task<ActionResult<GetPromosResponse>> _GetPromos([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetPromos");
            return method != null
                ? (await ((Task<GetPromosResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetQualityRatingDetails")]
        public async Task<ActionResult<GetQualityRatingDetailsResponse>> _GetQualityRatingDetails([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/ratings/quality/details")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetQualityRatingDetails");
            return method != null
                ? (await ((Task<GetQualityRatingDetailsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetQualityRatings")]
        public async Task<ActionResult<GetQualityRatingResponse>> _GetQualityRatings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/ratings/quality")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetQualityRatings");
            return method != null
                ? (await ((Task<GetQualityRatingResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetReportInfo")]
        public async Task<ActionResult<GetReportInfoResponse>> _GetReportInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "reports/info/{reportId}")]HttpRequest req, ExecutionContext context, string reportId)
        {
            var method = this.GetType().GetMethod("GetReportInfo");
            return method != null
                ? (await ((Task<GetReportInfoResponse>)method.Invoke(this, new object[] { req, context, reportId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetReturn")]
        public async Task<ActionResult<GetReturnResponse>> _GetReturn([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId)
        {
            var method = this.GetType().GetMethod("GetReturn");
            return method != null
                ? (await ((Task<GetReturnResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetReturnApplication")]
        public async Task<ActionResult<System.IO.Stream>> _GetReturnApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId)
        {
            var method = this.GetType().GetMethod("GetReturnApplication");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetReturnPhoto")]
        public async Task<ActionResult<System.IO.Stream>> _GetReturnPhoto([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId, long itemId, string imageHash)
        {
            var method = this.GetType().GetMethod("GetReturnPhoto");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId, itemId, imageHash })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetReturns")]
        public async Task<ActionResult<GetReturnsResponse>> _GetReturns([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/returns")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetReturns");
            return method != null
                ? (await ((Task<GetReturnsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetShipment")]
        public async Task<ActionResult<GetShipmentResponse>> _GetShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("GetShipment");
            return method != null
                ? (await ((Task<GetShipmentResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetShipmentOrdersInfo")]
        public async Task<ActionResult<GetShipmentOrdersInfoResponse>> _GetShipmentOrdersInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("GetShipmentOrdersInfo");
            return method != null
                ? (await ((Task<GetShipmentOrdersInfoResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetStocks")]
        public async Task<ActionResult<GetWarehouseStocksResponse>> _GetStocks([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offers/stocks")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetStocks");
            return method != null
                ? (await ((Task<GetWarehouseStocksResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetSuggestedOfferMappingEntries")]
        public async Task<ActionResult<GetSuggestedOfferMappingEntriesResponse>> _GetSuggestedOfferMappingEntries([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-mapping-entries/suggestions")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetSuggestedOfferMappingEntries");
            return method != null
                ? (await ((Task<GetSuggestedOfferMappingEntriesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetSuggestedOfferMappings")]
        public async Task<ActionResult<GetSuggestedOfferMappingsResponse>> _GetSuggestedOfferMappings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/suggestions")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetSuggestedOfferMappings");
            return method != null
                ? (await ((Task<GetSuggestedOfferMappingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetSuggestedPrices")]
        public async Task<ActionResult<SuggestPricesResponse>> _GetSuggestedPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-prices/suggestions")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetSuggestedPrices");
            return method != null
                ? (await ((Task<SuggestPricesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_GetWarehouses")]
        public async Task<ActionResult<GetWarehousesResponse>> _GetWarehouses([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "businesses/{businessId}/warehouses")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetWarehouses");
            return method != null
                ? (await ((Task<GetWarehousesResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_ProvideOrderItemIdentifiers")]
        public async Task<ActionResult<ProvideOrderItemIdentifiersResponse>> _ProvideOrderItemIdentifiers([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/identifiers")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("ProvideOrderItemIdentifiers");
            return method != null
                ? (await ((Task<ProvideOrderItemIdentifiersResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_PutBidsForBusiness")]
        public async Task<ActionResult<EmptyApiResponse>> _PutBidsForBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "businesses/{businessId}/bids")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("PutBidsForBusiness");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_PutBidsForCampaign")]
        public async Task<ActionResult<EmptyApiResponse>> _PutBidsForCampaign([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/bids")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("PutBidsForCampaign");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_RefreshFeed")]
        public async Task<ActionResult<EmptyApiResponse>> _RefreshFeed([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/feeds/{feedId}/refresh")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("RefreshFeed");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SearchRegionChildren")]
        public async Task<ActionResult<GetRegionWithChildrenResponse>> _SearchRegionChildren([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "regions/{regionId}/children")]HttpRequest req, ExecutionContext context, long regionId)
        {
            var method = this.GetType().GetMethod("SearchRegionChildren");
            return method != null
                ? (await ((Task<GetRegionWithChildrenResponse>)method.Invoke(this, new object[] { req, context, regionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SearchRegionsById")]
        public async Task<ActionResult<GetRegionsResponse>> _SearchRegionsById([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "regions/{regionId}")]HttpRequest req, ExecutionContext context, long regionId)
        {
            var method = this.GetType().GetMethod("SearchRegionsById");
            return method != null
                ? (await ((Task<GetRegionsResponse>)method.Invoke(this, new object[] { req, context, regionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SearchRegionsByName")]
        public async Task<ActionResult<GetRegionsResponse>> _SearchRegionsByName([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "regions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchRegionsByName");
            return method != null
                ? (await ((Task<GetRegionsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SearchShipments")]
        public async Task<ActionResult<SearchShipmentsResponse>> _SearchShipments([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/first-mile/shipments")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("SearchShipments");
            return method != null
                ? (await ((Task<SearchShipmentsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SendFileToChat")]
        public async Task<ActionResult<EmptyApiResponse>> _SendFileToChat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/file/send")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("SendFileToChat");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SendMessageToChat")]
        public async Task<ActionResult<EmptyApiResponse>> _SendMessageToChat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/message")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("SendMessageToChat");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SetFeedParams")]
        public async Task<ActionResult<EmptyApiResponse>> _SetFeedParams([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/feeds/{feedId}/params")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("SetFeedParams");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SetOrderBoxLayout")]
        public async Task<ActionResult<SetOrderBoxLayoutResponse>> _SetOrderBoxLayout([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/boxes")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("SetOrderBoxLayout");
            return method != null
                ? (await ((Task<SetOrderBoxLayoutResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SetOrderShipmentBoxes")]
        public async Task<ActionResult<SetOrderShipmentBoxesResponse>> _SetOrderShipmentBoxes([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long shipmentId)
        {
            var method = this.GetType().GetMethod("SetOrderShipmentBoxes");
            return method != null
                ? (await ((Task<SetOrderShipmentBoxesResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SetShipmentPalletsCount")]
        public async Task<ActionResult<EmptyApiResponse>> _SetShipmentPalletsCount([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("SetShipmentPalletsCount");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_SkipGoodsFeedbacksReaction")]
        public async Task<ActionResult<EmptyApiResponse>> _SkipGoodsFeedbacksReaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/skip-reaction")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("SkipGoodsFeedbacksReaction");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_TransferOrdersFromShipment")]
        public async Task<ActionResult<EmptyApiResponse>> _TransferOrdersFromShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("TransferOrdersFromShipment");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateBusinessPrices")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateBusinessPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-prices/updates")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateBusinessPrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateCampaignOffers")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateCampaignOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offers/update")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateCampaignOffers");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateGoodsFeedbackComment")]
        public async Task<ActionResult<UpdateGoodsFeedbackCommentResponse>> _UpdateGoodsFeedbackComment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/comments/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateGoodsFeedbackComment");
            return method != null
                ? (await ((Task<UpdateGoodsFeedbackCommentResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateOfferContent")]
        public async Task<ActionResult<UpdateOfferContentResponse>> _UpdateOfferContent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-cards/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateOfferContent");
            return method != null
                ? (await ((Task<UpdateOfferContentResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateOfferMappingEntries")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateOfferMappingEntries([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-mapping-entries/updates")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateOfferMappingEntries");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateOfferMappings")]
        public async Task<ActionResult<UpdateOfferMappingsResponse>> _UpdateOfferMappings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateOfferMappings");
            return method != null
                ? (await ((Task<UpdateOfferMappingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateOrderItems")]
        public async Task<ActionResult<>> _UpdateOrderItems([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/items")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("UpdateOrderItems");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateOrderStatus")]
        public async Task<ActionResult<UpdateOrderStatusResponse>> _UpdateOrderStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/status")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("UpdateOrderStatus");
            return method != null
                ? (await ((Task<UpdateOrderStatusResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateOrderStatuses")]
        public async Task<ActionResult<UpdateOrderStatusesResponse>> _UpdateOrderStatuses([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/status-update")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateOrderStatuses");
            return method != null
                ? (await ((Task<UpdateOrderStatusesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdatePrices")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdatePrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-prices/updates")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdatePrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdatePromoOffers")]
        public async Task<ActionResult<UpdatePromoOffersResponse>> _UpdatePromoOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos/offers/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdatePromoOffers");
            return method != null
                ? (await ((Task<UpdatePromoOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FbsApi_UpdateStocks")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateStocks([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/offers/stocks")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateStocks");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
