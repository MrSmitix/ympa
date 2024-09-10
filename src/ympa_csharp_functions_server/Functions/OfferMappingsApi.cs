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
    public partial class OfferMappingsApi
    { 
        [FunctionName("OfferMappingsApi_GetOfferMappingEntries")]
        public async Task<ActionResult<GetOfferMappingEntriesResponse>> _GetOfferMappingEntries([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/offer-mapping-entries")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetOfferMappingEntries");
            return method != null
                ? (await ((Task<GetOfferMappingEntriesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferMappingsApi_GetSuggestedOfferMappingEntries")]
        public async Task<ActionResult<GetSuggestedOfferMappingEntriesResponse>> _GetSuggestedOfferMappingEntries([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-mapping-entries/suggestions")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetSuggestedOfferMappingEntries");
            return method != null
                ? (await ((Task<GetSuggestedOfferMappingEntriesResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferMappingsApi_UpdateOfferMappingEntries")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateOfferMappingEntries([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offer-mapping-entries/updates")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateOfferMappingEntries");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
