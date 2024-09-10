namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteOffersRequest =

  //#region DeleteOffersRequest

  [<CLIMutable>]
  type DeleteOffersRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
