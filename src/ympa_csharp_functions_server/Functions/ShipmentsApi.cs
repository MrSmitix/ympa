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
    public partial class ShipmentsApi
    { 
        [FunctionName("ShipmentsApi_ConfirmShipment")]
        public async Task<ActionResult<EmptyApiResponse>> _ConfirmShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("ConfirmShipment");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_DownloadShipmentAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_DownloadShipmentDiscrepancyAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentDiscrepancyAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentDiscrepancyAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_DownloadShipmentInboundAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentInboundAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentInboundAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_DownloadShipmentPalletLabels")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentPalletLabels([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentPalletLabels");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_DownloadShipmentReceptionTransferAct")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentReceptionTransferAct([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/shipments/reception-transfer-act")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentReceptionTransferAct");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_DownloadShipmentTransportationWaybill")]
        public async Task<ActionResult<System.IO.Stream>> _DownloadShipmentTransportationWaybill([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("DownloadShipmentTransportationWaybill");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_GetShipment")]
        public async Task<ActionResult<GetShipmentResponse>> _GetShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("GetShipment");
            return method != null
                ? (await ((Task<GetShipmentResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_GetShipmentOrdersInfo")]
        public async Task<ActionResult<GetShipmentOrdersInfoResponse>> _GetShipmentOrdersInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("GetShipmentOrdersInfo");
            return method != null
                ? (await ((Task<GetShipmentOrdersInfoResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_SearchShipments")]
        public async Task<ActionResult<SearchShipmentsResponse>> _SearchShipments([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/first-mile/shipments")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("SearchShipments");
            return method != null
                ? (await ((Task<SearchShipmentsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_SetShipmentPalletsCount")]
        public async Task<ActionResult<EmptyApiResponse>> _SetShipmentPalletsCount([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("SetShipmentPalletsCount");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentsApi_TransferOrdersFromShipment")]
        public async Task<ActionResult<EmptyApiResponse>> _TransferOrdersFromShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer")]HttpRequest req, ExecutionContext context, long campaignId, long shipmentId)
        {
            var method = this.GetType().GetMethod("TransferOrdersFromShipment");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
