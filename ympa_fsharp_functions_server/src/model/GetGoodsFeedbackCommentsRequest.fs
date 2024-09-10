namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetGoodsFeedbackCommentsRequest =

  //#region GetGoodsFeedbackCommentsRequest

  [<CLIMutable>]
  type GetGoodsFeedbackCommentsRequest = {
    [<JsonProperty(PropertyName = "feedbackId")>]
    FeedbackId : int64;
  }

  //#endregion
