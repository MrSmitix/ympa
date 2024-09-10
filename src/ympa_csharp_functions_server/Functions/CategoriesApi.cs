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
    public partial class CategoriesApi
    { 
        [FunctionName("CategoriesApi_GetCategoriesMaxSaleQuantum")]
        public async Task<ActionResult<GetCategoriesMaxSaleQuantumResponse>> _GetCategoriesMaxSaleQuantum([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "categories/max-sale-quantum")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCategoriesMaxSaleQuantum");
            return method != null
                ? (await ((Task<GetCategoriesMaxSaleQuantumResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoriesApi_GetCategoriesTree")]
        public async Task<ActionResult<GetCategoriesResponse>> _GetCategoriesTree([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "categories/tree")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCategoriesTree");
            return method != null
                ? (await ((Task<GetCategoriesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
