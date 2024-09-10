namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetPricesByOfferIdsRequest =

  //#region GetPricesByOfferIdsRequest

  [<CLIMutable>]
  type GetPricesByOfferIdsRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
