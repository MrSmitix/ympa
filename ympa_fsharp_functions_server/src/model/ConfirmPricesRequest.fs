namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConfirmPricesRequest =

  //#region ConfirmPricesRequest

  [<CLIMutable>]
  type ConfirmPricesRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
