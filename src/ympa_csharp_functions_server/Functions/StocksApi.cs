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
    public partial class StocksApi
    { 
        [FunctionName("StocksApi_GetStocks")]
        public async Task<ActionResult<GetWarehouseStocksResponse>> _GetStocks([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "campaigns/{campaignId}/offers/stocks")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetStocks");
            return method != null
                ? (await ((Task<GetWarehouseStocksResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("StocksApi_UpdateStocks")]
        public async Task<ActionResult<EmptyApiResponse>> _UpdateStocks([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "campaigns/{campaignId}/offers/stocks")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("UpdateStocks");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
