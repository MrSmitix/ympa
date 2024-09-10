namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module FeedbackListDTO =

  //#region FeedbackListDTO

  [<CLIMutable>]
  type FeedbackListDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "feedbackList")>]
    FeedbackList : FeedbackDTO[];
  }

  //#endregion
