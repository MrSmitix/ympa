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
    public partial class PromosApi
    { 
        [FunctionName("PromosApi_DeletePromoOffers")]
        public async Task<ActionResult<DeletePromoOffersResponse>> _DeletePromoOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos/offers/delete")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeletePromoOffers");
            return method != null
                ? (await ((Task<DeletePromoOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PromosApi_GetPromoOffers")]
        public async Task<ActionResult<GetPromoOffersResponse>> _GetPromoOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos/offers")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetPromoOffers");
            return method != null
                ? (await ((Task<GetPromoOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PromosApi_GetPromos")]
        public async Task<ActionResult<GetPromosResponse>> _GetPromos([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetPromos");
            return method != null
                ? (await ((Task<GetPromosResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PromosApi_UpdatePromoOffers")]
        public async Task<ActionResult<UpdatePromoOffersResponse>> _UpdatePromoOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/promos/offers/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdatePromoOffers");
            return method != null
                ? (await ((Task<UpdatePromoOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
