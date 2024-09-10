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
    public partial class ReturnsApi
    { 
        [FunctionName("ReturnsApi_GetReturn")]
        public async Task<ActionResult<GetReturnResponse>> _GetReturn([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId)
        {
            var method = this.GetType().GetMethod("GetReturn");
            return method != null
                ? (await ((Task<GetReturnResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReturnsApi_GetReturnApplication")]
        public async Task<ActionResult<System.IO.Stream>> _GetReturnApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId)
        {
            var method = this.GetType().GetMethod("GetReturnApplication");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReturnsApi_GetReturnPhoto")]
        public async Task<ActionResult<System.IO.Stream>> _GetReturnPhoto([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId, long itemId, string imageHash)
        {
            var method = this.GetType().GetMethod("GetReturnPhoto");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId, itemId, imageHash })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReturnsApi_GetReturns")]
        public async Task<ActionResult<GetReturnsResponse>> _GetReturns([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/returns")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetReturns");
            return method != null
                ? (await ((Task<GetReturnsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReturnsApi_SetReturnDecision")]
        public async Task<ActionResult<EmptyApiResponse>> _SetReturnDecision([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId)
        {
            var method = this.GetType().GetMethod("SetReturnDecision");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReturnsApi_SubmitReturnDecision")]
        public async Task<ActionResult<EmptyApiResponse>> _SubmitReturnDecision([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit")]HttpRequest req, ExecutionContext context, long campaignId, long orderId, long returnId)
        {
            var method = this.GetType().GetMethod("SubmitReturnDecision");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, orderId, returnId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
