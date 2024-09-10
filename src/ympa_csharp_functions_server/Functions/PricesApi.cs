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
    public partial class PricesApi
    { 
        [FunctionName("PricesApi_GetPrices")]
        public async Task<ActionResult<GetPricesResponse>> _GetPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/offer-prices")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetPrices");
            return method != null
                ? (await ((Task<GetPricesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PricesApi_GetPricesByOfferIds")]
        public async Task<ActionResult<GetPricesByOfferIdsResponse>> _GetPricesByOfferIds([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-prices")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetPricesByOfferIds");
            return method != null
                ? (await ((Task<GetPricesByOfferIdsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PricesApi_GetSuggestedPrices")]
        public async Task<ActionResult<SuggestPricesResponse>> _GetSuggestedPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-prices/suggestions")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetSuggestedPrices");
            return method != null
                ? (await ((Task<SuggestPricesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PricesApi_UpdateBusinessPrices")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateBusinessPrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-prices/updates")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateBusinessPrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PricesApi_UpdatePrices")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdatePrices([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-prices/updates")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdatePrices");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
