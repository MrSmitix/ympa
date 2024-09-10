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
    public partial class BidsApi
    { 
        [FunctionName("BidsApi_GetBidsInfoForBusiness")]
        public async Task<ActionResult<GetBidsInfoResponse>> _GetBidsInfoForBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/bids/info")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBidsInfoForBusiness");
            return method != null
                ? (await ((Task<GetBidsInfoResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BidsApi_GetBidsRecommendations")]
        public async Task<ActionResult<GetBidsRecommendationsResponse>> _GetBidsRecommendations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/bids/recommendations")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBidsRecommendations");
            return method != null
                ? (await ((Task<GetBidsRecommendationsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BidsApi_PutBidsForBusiness")]
        public async Task<ActionResult<EmptyApiResponse>> _PutBidsForBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "businesses/{businessId}/bids")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("PutBidsForBusiness");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BidsApi_PutBidsForCampaign")]
        public async Task<ActionResult<EmptyApiResponse>> _PutBidsForCampaign([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/bids")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("PutBidsForCampaign");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
