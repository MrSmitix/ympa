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
    public partial class DeliveryServicesApi
    { 
        [FunctionName("DeliveryServicesApi_GetDeliveryServices")]
        public async Task<ActionResult<GetDeliveryServicesResponse>> _GetDeliveryServices([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "delivery/services")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetDeliveryServices");
            return method != null
                ? (await ((Task<GetDeliveryServicesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
