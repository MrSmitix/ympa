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
    public partial class TariffsApi
    { 
        [FunctionName("TariffsApi_CalculateTariffs")]
        public async Task<ActionResult<CalculateTariffsResponse>> _CalculateTariffs([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "tariffs/calculate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CalculateTariffs");
            return method != null
                ? (await ((Task<CalculateTariffsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
