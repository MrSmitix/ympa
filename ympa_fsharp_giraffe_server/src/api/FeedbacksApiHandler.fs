namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open FeedbacksApiHandlerParams
open FeedbacksApiServiceInterface
open FeedbacksApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetFeedbackListResponse

module FeedbacksApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetFeedbackAndCommentUpdates
    /// <summary>
    /// Новые и обновленные отзывы о магазине
    /// </summary>

    let GetFeedbackAndCommentUpdates (pathParams:GetFeedbackAndCommentUpdatesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetFeedbackAndCommentUpdatesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetFeedbackAndCommentUpdatesArgs
          let result = FeedbacksApiService.GetFeedbackAndCommentUpdates ctx serviceArgs
          return! (match result with
                      | GetFeedbackAndCommentUpdatesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

