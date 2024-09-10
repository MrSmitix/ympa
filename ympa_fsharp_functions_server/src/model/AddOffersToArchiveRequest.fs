namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AddOffersToArchiveRequest =

  //#region AddOffersToArchiveRequest

  [<CLIMutable>]
  type AddOffersToArchiveRequest = {
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
