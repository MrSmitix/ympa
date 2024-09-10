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
    public partial class ModelsApi
    { 
        [FunctionName("ModelsApi_GetModel")]
        public async Task<ActionResult<GetModelsResponse>> _GetModel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "models/{modelId}")]HttpRequest req, ExecutionContext context, long modelId)
        {
            var method = this.GetType().GetMethod("GetModel");
            return method != null
                ? (await ((Task<GetModelsResponse>)method.Invoke(this, new object[] { req, context, modelId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ModelsApi_GetModelOffers")]
        public async Task<ActionResult<GetModelsOffersResponse>> _GetModelOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "models/{modelId}/offers")]HttpRequest req, ExecutionContext context, long modelId)
        {
            var method = this.GetType().GetMethod("GetModelOffers");
            return method != null
                ? (await ((Task<GetModelsOffersResponse>)method.Invoke(this, new object[] { req, context, modelId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ModelsApi_GetModels")]
        public async Task<ActionResult<GetModelsResponse>> _GetModels([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "models")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetModels");
            return method != null
                ? (await ((Task<GetModelsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ModelsApi_GetModelsOffers")]
        public async Task<ActionResult<GetModelsOffersResponse>> _GetModelsOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "models/offers")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetModelsOffers");
            return method != null
                ? (await ((Task<GetModelsOffersResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ModelsApi_SearchModels")]
        public async Task<ActionResult<SearchModelsResponse>> _SearchModels([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "models")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchModels");
            return method != null
                ? (await ((Task<SearchModelsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
