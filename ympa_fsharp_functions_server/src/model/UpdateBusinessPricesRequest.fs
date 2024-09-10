namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateBusinessOfferPriceDTO

module UpdateBusinessPricesRequest =

  //#region UpdateBusinessPricesRequest

  [<CLIMutable>]
  type UpdateBusinessPricesRequest = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : UpdateBusinessOfferPriceDTO[];
  }

  //#endregion
