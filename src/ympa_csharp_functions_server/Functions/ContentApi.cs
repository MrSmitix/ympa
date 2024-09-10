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
    public partial class ContentApi
    { 
        [FunctionName("ContentApi_GetCategoryContentParameters")]
        public async Task<ActionResult<GetCategoryContentParametersResponse>> _GetCategoryContentParameters([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "category/{categoryId}/parameters")]HttpRequest req, ExecutionContext context, long categoryId)
        {
            var method = this.GetType().GetMethod("GetCategoryContentParameters");
            return method != null
                ? (await ((Task<GetCategoryContentParametersResponse>)method.Invoke(this, new object[] { req, context, categoryId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContentApi_GetOfferCardsContentStatus")]
        public async Task<ActionResult<GetOfferCardsContentStatusResponse>> _GetOfferCardsContentStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-cards")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetOfferCardsContentStatus");
            return method != null
                ? (await ((Task<GetOfferCardsContentStatusResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContentApi_UpdateOfferContent")]
        public async Task<ActionResult<UpdateOfferContentResponse>> _UpdateOfferContent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-cards/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateOfferContent");
            return method != null
                ? (await ((Task<UpdateOfferContentResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
