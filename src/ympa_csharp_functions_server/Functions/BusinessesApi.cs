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
    public partial class BusinessesApi
    { 
        [FunctionName("BusinessesApi_GetBusinessSettings")]
        public async Task<ActionResult<GetBusinessSettingsResponse>> _GetBusinessSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/settings")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetBusinessSettings");
            return method != null
                ? (await ((Task<GetBusinessSettingsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
