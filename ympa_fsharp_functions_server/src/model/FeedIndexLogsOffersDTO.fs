namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedIndexLogsOffersDTO =

  //#region FeedIndexLogsOffersDTO

  [<CLIMutable>]
  type FeedIndexLogsOffersDTO = {
    [<JsonProperty(PropertyName = "rejectedCount")>]
    RejectedCount : int64;
    [<JsonProperty(PropertyName = "totalCount")>]
    TotalCount : int64;
  }

  //#endregion
