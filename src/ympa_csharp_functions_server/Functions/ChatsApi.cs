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
    public partial class ChatsApi
    { 
        [FunctionName("ChatsApi_CreateChat")]
        public async Task<ActionResult<CreateChatResponse>> _CreateChat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/new")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("CreateChat");
            return method != null
                ? (await ((Task<CreateChatResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ChatsApi_GetChatHistory")]
        public async Task<ActionResult<GetChatHistoryResponse>> _GetChatHistory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/history")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetChatHistory");
            return method != null
                ? (await ((Task<GetChatHistoryResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ChatsApi_GetChats")]
        public async Task<ActionResult<GetChatsResponse>> _GetChats([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("GetChats");
            return method != null
                ? (await ((Task<GetChatsResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ChatsApi_SendFileToChat")]
        public async Task<ActionResult<EmptyApiResponse>> _SendFileToChat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/file/send")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("SendFileToChat");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ChatsApi_SendMessageToChat")]
        public async Task<ActionResult<EmptyApiResponse>> _SendMessageToChat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "businesses/{businessId}/chats/message")]HttpRequest req, ExecutionContext context, long businessId)
        {
            var method = this.GetType().GetMethod("SendMessageToChat");
            return method != null
                ? (await ((Task<EmptyApiResponse>)method.Invoke(this, new object[] { req, context, businessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
