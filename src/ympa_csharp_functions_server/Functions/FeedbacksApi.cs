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
    public partial class FeedbacksApi
    { 
        [FunctionName("FeedbacksApi_GetFeedbackAndCommentUpdates")]
        public async Task<ActionResult<GetFeedbackListResponse>> _GetFeedbackAndCommentUpdates([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/feedback/updates")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetFeedbackAndCommentUpdates");
            return method != null
                ? (await ((Task<GetFeedbackListResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
