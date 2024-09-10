namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ChatsApiHandlerParams
open ChatsApiServiceInterface
open ChatsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CreateChatRequest
open ympa_fsharp_giraffe_server.Model.CreateChatResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetChatHistoryRequest
open ympa_fsharp_giraffe_server.Model.GetChatHistoryResponse
open ympa_fsharp_giraffe_server.Model.GetChatsRequest
open ympa_fsharp_giraffe_server.Model.GetChatsResponse
open ympa_fsharp_giraffe_server.Model.SendMessageToChatRequest

module ChatsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateChat
    /// <summary>
    /// Создание нового чата с покупателем
    /// </summary>

    let CreateChat (pathParams:CreateChatPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateChatBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateChatArgs
          let result = ChatsApiService.CreateChat ctx serviceArgs
          return! (match result with
                      | CreateChatStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateChatStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CreateChatStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CreateChatStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CreateChatStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CreateChatStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | CreateChatStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetChatHistory
    /// <summary>
    /// Получение истории сообщений в чате
    /// </summary>

    let GetChatHistory (pathParams:GetChatHistoryPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetChatHistoryQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetChatHistoryBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetChatHistoryArgs
          let result = ChatsApiService.GetChatHistory ctx serviceArgs
          return! (match result with
                      | GetChatHistoryStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetChatHistoryStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetChatHistoryStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetChatHistoryStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetChatHistoryStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetChatHistoryStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetChatHistoryStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetChats
    /// <summary>
    /// Получение доступных чатов
    /// </summary>

    let GetChats (pathParams:GetChatsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetChatsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetChatsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetChatsArgs
          let result = ChatsApiService.GetChats ctx serviceArgs
          return! (match result with
                      | GetChatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetChatsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetChatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetChatsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetChatsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetChatsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetChatsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SendFileToChat
    /// <summary>
    /// Отправка файла в чат
    /// </summary>

    let SendFileToChat (pathParams:SendFileToChatPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SendFileToChatQueryParams>()
          let! formParams = ctx.TryBindFormAsync<SendFileToChatFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams; pathParams=pathParams;  } : SendFileToChatArgs
          let result = ChatsApiService.SendFileToChat ctx serviceArgs
          return! (match result with
                      | SendFileToChatStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SendFileToChatStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SendFileToChatStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SendFileToChatStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SendFileToChatStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SendFileToChatStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SendFileToChatStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SendMessageToChat
    /// <summary>
    /// Отправка сообщения в чат
    /// </summary>

    let SendMessageToChat (pathParams:SendMessageToChatPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SendMessageToChatQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<SendMessageToChatBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : SendMessageToChatArgs
          let result = ChatsApiService.SendMessageToChat ctx serviceArgs
          return! (match result with
                      | SendMessageToChatStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SendMessageToChatStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SendMessageToChatStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SendMessageToChatStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SendMessageToChatStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SendMessageToChatStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SendMessageToChatStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

