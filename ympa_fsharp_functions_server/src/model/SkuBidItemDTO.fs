namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SkuBidItemDTO =

  //#region SkuBidItemDTO

  [<CLIMutable>]
  type SkuBidItemDTO = {
    [<JsonProperty(PropertyName = "sku")>]
    Sku : string;
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int;
  }

  //#endregion
