namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.HiddenOfferDTO

module AddHiddenOffersRequest =

  //#region AddHiddenOffersRequest

  [<CLIMutable>]
  type AddHiddenOffersRequest = {
    [<JsonProperty(PropertyName = "hiddenOffers")>]
    HiddenOffers : HiddenOfferDTO[];
  }

  //#endregion
