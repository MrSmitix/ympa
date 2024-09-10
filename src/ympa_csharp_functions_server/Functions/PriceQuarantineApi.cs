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
    public partial class PriceQuarantineApi
    { 
        [FunctionName("PriceQuarantineApi_ConfirmBusinessPrices")]
        public async Task<ActionResult<EmptyApiResponse>> _ConfirmBusinessPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/price-quarantine/confirm")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("ConfirmBusinessPrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PriceQuarantineApi_ConfirmCampaignPrices")]
        public async Task<ActionResult<EmptyApiResponse>> _ConfirmCampaignPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/price-quarantine/confirm")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("ConfirmCampaignPrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PriceQuarantineApi_GetBusinessQuarantineOffers")]
        public async Task<ActionResult<GetQuarantineOffersResponse>> _GetBusinessQuarantineOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/price-quarantine")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBusinessQuarantineOffers");
            return method != null
                ? (await ((Task<GetQuarantineOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PriceQuarantineApi_GetCampaignQuarantineOffers")]
        public async Task<ActionResult<GetQuarantineOffersResponse>> _GetCampaignQuarantineOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/price-quarantine")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignQuarantineOffers");
            return method != null
                ? (await ((Task<GetQuarantineOffersResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
