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
    public partial class BusinessOfferMappingsApi
    { 
        [FunctionName("BusinessOfferMappingsApi_AddOffersToArchive")]
        public async Task<ActionResult<AddOffersToArchiveResponse>> _AddOffersToArchive([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/archive")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("AddOffersToArchive");
            return method != null
                ? (await ((Task<AddOffersToArchiveResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessOfferMappingsApi_DeleteOffers")]
        public async Task<ActionResult<DeleteOffersResponse>> _DeleteOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/delete")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeleteOffers");
            return method != null
                ? (await ((Task<DeleteOffersResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessOfferMappingsApi_DeleteOffersFromArchive")]
        public async Task<ActionResult<DeleteOffersFromArchiveResponse>> _DeleteOffersFromArchive([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/unarchive")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeleteOffersFromArchive");
            return method != null
                ? (await ((Task<DeleteOffersFromArchiveResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessOfferMappingsApi_GetOfferMappings")]
        public async Task<ActionResult<GetOfferMappingsResponse>> _GetOfferMappings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetOfferMappings");
            return method != null
                ? (await ((Task<GetOfferMappingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessOfferMappingsApi_GetSuggestedOfferMappings")]
        public async Task<ActionResult<GetSuggestedOfferMappingsResponse>> _GetSuggestedOfferMappings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/suggestions")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetSuggestedOfferMappings");
            return method != null
                ? (await ((Task<GetSuggestedOfferMappingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BusinessOfferMappingsApi_UpdateOfferMappings")]
        public async Task<ActionResult<UpdateOfferMappingsResponse>> _UpdateOfferMappings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/offer-mappings/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateOfferMappings");
            return method != null
                ? (await ((Task<UpdateOfferMappingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
