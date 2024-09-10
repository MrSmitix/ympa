namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.HiddenOfferDTO

module DeleteHiddenOffersRequest =

  //#region DeleteHiddenOffersRequest

  [<CLIMutable>]
  type DeleteHiddenOffersRequest = {
    [<JsonProperty(PropertyName = "hiddenOffers")>]
    HiddenOffers : HiddenOfferDTO[];
  }

  //#endregion
