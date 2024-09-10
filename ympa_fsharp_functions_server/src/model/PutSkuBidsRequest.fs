namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.SkuBidItemDTO

module PutSkuBidsRequest =

  //#region PutSkuBidsRequest

  [<CLIMutable>]
  type PutSkuBidsRequest = {
    [<JsonProperty(PropertyName = "bids")>]
    Bids : SkuBidItemDTO[];
  }

  //#endregion
