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
    public partial class OrdersApi
    { 
        [FunctionName("OrdersApi_AcceptOrderCancellation")]
        public async Task<ActionResult<EmptyApiResponse>> _AcceptOrderCancellation([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/cancellation/accept")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("AcceptOrderCancellation");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_GetOrder")]
        public async Task<ActionResult<GetOrderResponse>> _GetOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrder");
            return method != null
                ? (await ((Task<GetOrderResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_GetOrders")]
        public async Task<ActionResult<GetOrdersResponse>> _GetOrders([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOrders");
            return method != null
                ? (await ((Task<GetOrdersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_ProvideOrderDigitalCodes")]
        public async Task<ActionResult<EmptyApiResponse>> _ProvideOrderDigitalCodes([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("ProvideOrderDigitalCodes");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_ProvideOrderItemIdentifiers")]
        public async Task<ActionResult<ProvideOrderItemIdentifiersResponse>> _ProvideOrderItemIdentifiers([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/identifiers")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("ProvideOrderItemIdentifiers");
            return method != null
                ? (await ((Task<ProvideOrderItemIdentifiersResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_SetOrderBoxLayout")]
        public async Task<ActionResult<SetOrderBoxLayoutResponse>> _SetOrderBoxLayout([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/boxes")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("SetOrderBoxLayout");
            return method != null
                ? (await ((Task<SetOrderBoxLayoutResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_SetOrderShipmentBoxes")]
        public async Task<ActionResult<SetOrderShipmentBoxesResponse>> _SetOrderShipmentBoxes([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long shipmentId)
        {
            var method = this.GetType().GetMethod("SetOrderShipmentBoxes");
            return method != null
                ? (await ((Task<SetOrderShipmentBoxesResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId, shipmentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_UpdateOrderItems")]
        public async Task<ActionResult<>> _UpdateOrderItems([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/items")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("UpdateOrderItems");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_UpdateOrderStatus")]
        public async Task<ActionResult<UpdateOrderStatusResponse>> _UpdateOrderStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/orders/{orderId}/status")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("UpdateOrderStatus");
            return method != null
                ? (await ((Task<UpdateOrderStatusResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrdersApi_UpdateOrderStatuses")]
        public async Task<ActionResult<UpdateOrderStatusesResponse>> _UpdateOrderStatuses([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/status-update")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateOrderStatuses");
            return method != null
                ? (await ((Task<UpdateOrderStatusesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
