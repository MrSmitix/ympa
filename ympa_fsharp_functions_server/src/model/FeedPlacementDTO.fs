namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedStatusType

module FeedPlacementDTO =

  //#region FeedPlacementDTO

  [<CLIMutable>]
  type FeedPlacementDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : FeedStatusType;
    [<JsonProperty(PropertyName = "totalOffersCount")>]
    TotalOffersCount : int;
  }

  //#endregion
