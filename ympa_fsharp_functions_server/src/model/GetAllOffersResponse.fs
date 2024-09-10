namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferDTO

module GetAllOffersResponse =

  //#region GetAllOffersResponse

  [<CLIMutable>]
  type GetAllOffersResponse = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : OfferDTO[];
  }

  //#endregion
