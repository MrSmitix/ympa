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
    public partial class RegionsApi
    { 
        [FunctionName("RegionsApi_SearchRegionChildren")]
        public async Task<ActionResult<GetRegionWithChildrenResponse>> _SearchRegionChildren([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "regions/{regionId}/children")]HttpRequest req, ExecutionContext context, long regionId)
        {
            var method = this.GetType().GetMethod("SearchRegionChildren");
            return method != null
                ? (await ((Task<GetRegionWithChildrenResponse>)method.Invoke(this, new object[] { req, context, regionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RegionsApi_SearchRegionsById")]
        public async Task<ActionResult<GetRegionsResponse>> _SearchRegionsById([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "regions/{regionId}")]HttpRequest req, ExecutionContext context, long regionId)
        {
            var method = this.GetType().GetMethod("SearchRegionsById");
            return method != null
                ? (await ((Task<GetRegionsResponse>)method.Invoke(this, new object[] { req, context, regionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RegionsApi_SearchRegionsByName")]
        public async Task<ActionResult<GetRegionsResponse>> _SearchRegionsByName([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "regions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchRegionsByName");
            return method != null
                ? (await ((Task<GetRegionsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
