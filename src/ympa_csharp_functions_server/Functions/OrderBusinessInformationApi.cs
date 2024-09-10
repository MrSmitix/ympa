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
    public partial class OrderBusinessInformationApi
    { 
        [FunctionName("OrderBusinessInformationApi_GetOrderBusinessBuyerInfo")]
        public async Task<ActionResult<GetBusinessBuyerInfoResponse>> _GetOrderBusinessBuyerInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/business-buyer")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrderBusinessBuyerInfo");
            return method != null
                ? (await ((Task<GetBusinessBuyerInfoResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrderBusinessInformationApi_GetOrderBusinessDocumentsInfo")]
        public async Task<ActionResult<GetBusinessDocumentsInfoResponse>> _GetOrderBusinessDocumentsInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/documents")]HttpRequest req, ExecutionContext context, long campaignId, long orderId)
        {
            var method = this.GetType().GetMethod("GetOrderBusinessDocumentsInfo");
            return method != null
                ? (await ((Task<GetBusinessDocumentsInfoResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
