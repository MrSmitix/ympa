namespace ympa_fsharp_functions_server

open FeedbacksApiHandlerParams
open FeedbacksApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module FeedbacksApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetFeedbackAndCommentUpdates
    /// <summary>
    /// Новые и обновленные отзывы о магазине
    /// </summary>
   [<FunctionName("GetFeedbackAndCommentUpdates")>]
    let GetFeedbackAndCommentUpdates
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/campaigns/{campaignId}/feedback/updates")>]
        req:HttpRequest ) =

      let result = FeedbacksApiService.GetFeedbackAndCommentUpdates ()
      match result with
      | GetFeedbackAndCommentUpdatesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | GetFeedbackAndCommentUpdatesStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | GetFeedbackAndCommentUpdatesStatusCode401 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(401))
      | GetFeedbackAndCommentUpdatesStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | GetFeedbackAndCommentUpdatesStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | GetFeedbackAndCommentUpdatesStatusCode420 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(420))
      | GetFeedbackAndCommentUpdatesStatusCode500 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(500))

