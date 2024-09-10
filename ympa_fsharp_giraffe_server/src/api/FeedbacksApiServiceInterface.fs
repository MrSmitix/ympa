namespace ympa_fsharp_giraffe_server
open FeedbacksApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module FeedbacksApiServiceInterface =

    //#region Service interface
    type IFeedbacksApiService =
      abstract member GetFeedbackAndCommentUpdates:HttpContext -> GetFeedbackAndCommentUpdatesArgs->GetFeedbackAndCommentUpdatesResult
    //#endregion