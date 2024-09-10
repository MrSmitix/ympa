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
    public partial class RatingsApi
    { 
        [FunctionName("RatingsApi_GetQualityRatingDetails")]
        public async Task<ActionResult<GetQualityRatingDetailsResponse>> _GetQualityRatingDetails([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/ratings/quality/details")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetQualityRatingDetails");
            return method != null
                ? (await ((Task<GetQualityRatingDetailsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RatingsApi_GetQualityRatings")]
        public async Task<ActionResult<GetQualityRatingResponse>> _GetQualityRatings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/ratings/quality")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetQualityRatings");
            return method != null
                ? (await ((Task<GetQualityRatingResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
