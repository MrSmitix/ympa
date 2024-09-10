namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidRecommendationItemDTO =

  //#region BidRecommendationItemDTO

  [<CLIMutable>]
  type BidRecommendationItemDTO = {
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int;
    [<JsonProperty(PropertyName = "showPercent")>]
    ShowPercent : int64;
  }

  //#endregion
