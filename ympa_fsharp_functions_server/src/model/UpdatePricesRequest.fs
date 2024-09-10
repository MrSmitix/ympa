namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferPriceDTO

module UpdatePricesRequest =

  //#region UpdatePricesRequest

  [<CLIMutable>]
  type UpdatePricesRequest = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : OfferPriceDTO[];
  }

  //#endregion
