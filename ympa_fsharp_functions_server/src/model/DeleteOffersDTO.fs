namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteOffersDTO =

  //#region DeleteOffersDTO

  [<CLIMutable>]
  type DeleteOffersDTO = {
    [<JsonProperty(PropertyName = "notDeletedOfferIds")>]
    NotDeletedOfferIds : string[];
  }

  //#endregion
