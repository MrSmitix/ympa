namespace ympa_fsharp_functions_server
open FeedsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module FeedsApiServiceInterface =

    //#region Service interface
    type IFeedsApiService =
      abstract member GetFeed : unit -> GetFeedResult
      abstract member GetFeedIndexLogs : unit -> GetFeedIndexLogsResult
      abstract member GetFeeds : unit -> GetFeedsResult
      abstract member RefreshFeed : unit -> RefreshFeedResult
      abstract member SetFeedParams : SetFeedParamsBodyParams -> SetFeedParamsResult
    //#endregion