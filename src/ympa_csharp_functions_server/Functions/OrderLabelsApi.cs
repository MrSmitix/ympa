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
    public partial class OrderLabelsApi
    { 
        [FunctionName("OrderLabelsApi_GenerateOrderLabel")]
        public async Task<ActionResult<System.IO.Stream>> _GenerateOrderLabel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long shipmentId, long boxId)
        {
            var method = this.GetType().GetMethod("GenerateOrderLabel");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId, shipmentId, boxId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrderLabelsApi_GenerateOrderLabels")]
        public async Task<ActionResult<System.IO.Stream>> _GenerateOrderLabels([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/labels")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GenerateOrderLabels");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrderLabelsApi_GetOrderLabelsData")]
        public async Task<ActionResult<GetOrderLabelsDataResponse>> _GetOrderLabelsData([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/delivery/labels/data")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrderLabelsData");
            return method != null
                ? (await ((Task<GetOrderLabelsDataResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
