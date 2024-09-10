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
    public partial class WarehousesApi
    { 
        [FunctionName("WarehousesApi_GetFulfillmentWarehouses")]
        public async Task<ActionResult<GetFulfillmentWarehousesResponse>> _GetFulfillmentWarehouses([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "warehouses")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetFulfillmentWarehouses");
            return method != null
                ? (await ((Task<GetFulfillmentWarehousesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WarehousesApi_GetWarehouses")]
        public async Task<ActionResult<GetWarehousesResponse>> _GetWarehouses([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "businesses/{businessId}/warehouses")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetWarehouses");
            return method != null
                ? (await ((Task<GetWarehousesResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
