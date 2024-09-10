namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module SkipGoodsFeedbackReactionRequest =

  //#region SkipGoodsFeedbackReactionRequest

  [<CLIMutable>]
  type SkipGoodsFeedbackReactionRequest = {
    [<JsonProperty(PropertyName = "feedbackIds")>]
    FeedbackIds : int64[];
  }

  //#endregion
