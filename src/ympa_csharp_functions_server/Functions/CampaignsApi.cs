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
    public partial class CampaignsApi
    { 
        [FunctionName("CampaignsApi_GetCampaign")]
        public async Task<ActionResult<GetCampaignResponse>> _GetCampaign([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaign");
            return method != null
                ? (await ((Task<GetCampaignResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_GetCampaignLogins")]
        public async Task<ActionResult<GetCampaignLoginsResponse>> _GetCampaignLogins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/logins")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignLogins");
            return method != null
                ? (await ((Task<GetCampaignLoginsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_GetCampaignRegion")]
        public async Task<ActionResult<GetCampaignRegionResponse>> _GetCampaignRegion([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/region")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignRegion");
            return method != null
                ? (await ((Task<GetCampaignRegionResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_GetCampaignSettings")]
        public async Task<ActionResult<GetCampaignSettingsResponse>> _GetCampaignSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/{campaignId}/settings")]HttpRequest req, ExecutionContext context, long campaignId)
        {
            var method = this.GetType().GetMethod("GetCampaignSettings");
            return method != null
                ? (await ((Task<GetCampaignSettingsResponse>)method.Invoke(this, new object[] { req, context, campaignId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_GetCampaigns")]
        public async Task<ActionResult<GetCampaignsResponse>> _GetCampaigns([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCampaigns");
            return method != null
                ? (await ((Task<GetCampaignsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_GetCampaignsByLogin")]
        public async Task<ActionResult<GetCampaignsResponse>> _GetCampaignsByLogin([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "campaigns/by_login/{login}")]HttpRequest req, ExecutionContext context, string login)
        {
            var method = this.GetType().GetMethod("GetCampaignsByLogin");
            return method != null
                ? (await ((Task<GetCampaignsResponse>)method.Invoke(this, new object[] { req, context, login })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
