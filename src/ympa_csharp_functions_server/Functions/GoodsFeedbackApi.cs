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
    public partial class GoodsFeedbackApi
    { 
        [FunctionName("GoodsFeedbackApi_DeleteGoodsFeedbackComment")]
        public async Task<ActionResult<EmptyApiResponse>> _DeleteGoodsFeedbackComment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/comments/delete")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("DeleteGoodsFeedbackComment");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GoodsFeedbackApi_GetGoodsFeedbackComments")]
        public async Task<ActionResult<GetGoodsFeedbackCommentsResponse>> _GetGoodsFeedbackComments([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/comments")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetGoodsFeedbackComments");
            return method != null
                ? (await ((Task<GetGoodsFeedbackCommentsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GoodsFeedbackApi_GetGoodsFeedbacks")]
        public async Task<ActionResult<GetGoodsFeedbackResponse>> _GetGoodsFeedbacks([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetGoodsFeedbacks");
            return method != null
                ? (await ((Task<GetGoodsFeedbackResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GoodsFeedbackApi_SkipGoodsFeedbacksReaction")]
        public async Task<ActionResult<EmptyApiResponse>> _SkipGoodsFeedbacksReaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/skip-reaction")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("SkipGoodsFeedbacksReaction");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GoodsFeedbackApi_UpdateGoodsFeedbackComment")]
        public async Task<ActionResult<UpdateGoodsFeedbackCommentResponse>> _UpdateGoodsFeedbackComment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/goods-feedback/comments/update")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("UpdateGoodsFeedbackComment");
            return method != null
                ? (await ((Task<UpdateGoodsFeedbackCommentResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
