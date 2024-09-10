namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedContentErrorDTO
open ympa_fsharp_functions_server.Model.FeedStatusType

module FeedContentDTO =

  //#region FeedContentDTO

  [<CLIMutable>]
  type FeedContentDTO = {
    [<JsonProperty(PropertyName = "rejectedOffersCount")>]
    RejectedOffersCount : int64;
    [<JsonProperty(PropertyName = "status")>]
    Status : FeedStatusType;
    [<JsonProperty(PropertyName = "totalOffersCount")>]
    TotalOffersCount : int64;
    [<JsonProperty(PropertyName = "error")>]
    Error : FeedContentErrorDTO;
  }

  //#endregion
