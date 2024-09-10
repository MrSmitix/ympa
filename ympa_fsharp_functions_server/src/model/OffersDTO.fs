namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferDTO

module OffersDTO =

  //#region OffersDTO

  [<CLIMutable>]
  type OffersDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : OfferDTO[];
  }

  //#endregion
