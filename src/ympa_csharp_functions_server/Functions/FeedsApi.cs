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
    public partial class FeedsApi
    { 
        [FunctionName("FeedsApi_GetFeed")]
        public async Task<ActionResult<GetFeedResponse>> _GetFeed([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feeds/{feedId}")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("GetFeed");
            return method != null
                ? (await ((Task<GetFeedResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FeedsApi_GetFeedIndexLogs")]
        public async Task<ActionResult<GetFeedIndexLogsResponse>> _GetFeedIndexLogs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feeds/{feedId}/index-logs")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("GetFeedIndexLogs");
            return method != null
                ? (await ((Task<GetFeedIndexLogsResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FeedsApi_GetFeeds")]
        public async Task<ActionResult<GetFeedsResponse>> _GetFeeds([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feeds")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetFeeds");
            return method != null
                ? (await ((Task<GetFeedsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FeedsApi_RefreshFeed")]
        public async Task<ActionResult<EmptyApiResponse>> _RefreshFeed([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/feeds/{feedId}/refresh")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("RefreshFeed");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FeedsApi_SetFeedParams")]
        public async Task<ActionResult<EmptyApiResponse>> _SetFeedParams([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/feeds/{feedId}/params")]HttpRequest req, ExecutionContext context, long campaignId, long feedId)
        {
            var method = this.GetType().GetMethod("SetFeedParams");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId, feedId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
