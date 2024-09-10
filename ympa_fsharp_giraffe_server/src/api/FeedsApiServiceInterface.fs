namespace ympa_fsharp_giraffe_server
open FeedsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module FeedsApiServiceInterface =

    //#region Service interface
    type IFeedsApiService =
      abstract member GetFeed:HttpContext -> GetFeedArgs->GetFeedResult
      abstract member GetFeedIndexLogs:HttpContext -> GetFeedIndexLogsArgs->GetFeedIndexLogsResult
      abstract member GetFeeds:HttpContext -> GetFeedsArgs->GetFeedsResult
      abstract member RefreshFeed:HttpContext -> RefreshFeedArgs->RefreshFeedResult
      abstract member SetFeedParams:HttpContext -> SetFeedParamsArgs->SetFeedParamsResult
    //#endregion