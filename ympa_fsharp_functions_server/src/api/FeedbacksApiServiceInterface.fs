namespace ympa_fsharp_functions_server
open FeedbacksApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module FeedbacksApiServiceInterface =

    //#region Service interface
    type IFeedbacksApiService =
      abstract member GetFeedbackAndCommentUpdates : unit -> GetFeedbackAndCommentUpdatesResult
    //#endregion