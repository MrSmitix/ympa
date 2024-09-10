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
    public partial class OutletsApi
    { 
        [FunctionName("OutletsApi_CreateOutlet")]
        public async Task<ActionResult<CreateOutletResponse>> _CreateOutlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/outlets")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("CreateOutlet");
            return method != null
                ? (await ((Task<CreateOutletResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OutletsApi_DeleteOutlet")]
        public async Task<ActionResult<EmptyApiResponse>> _DeleteOutlet([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "campaigns/{campaignId}/outlets/{outletId}")]HttpRequest req, ExecutionContext context, long campaignId, long outletId)
        {
            var method = this.GetType().GetMethod("DeleteOutlet");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, outletId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OutletsApi_GetOutlet")]
        public async Task<ActionResult<GetOutletResponse>> _GetOutlet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/outlets/{outletId}")]HttpRequest req, ExecutionContext context, long campaignId, long outletId)
        {
            var method = this.GetType().GetMethod("GetOutlet");
            return method != null
                ? (await ((Task<GetOutletResponse>)method.Invoke(this, new object[] { req, context, campaignId, outletId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OutletsApi_GetOutlets")]
        public async Task<ActionResult<GetOutletsResponse>> _GetOutlets([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/outlets")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOutlets");
            return method != null
                ? (await ((Task<GetOutletsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OutletsApi_UpdateOutlet")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateOutlet([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/outlets/{outletId}")]HttpRequest req, ExecutionContext context, long campaignId, long outletId)
        {
            var method = this.GetType().GetMethod("UpdateOutlet");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, outletId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
