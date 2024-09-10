namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.SuggestOfferPriceDTO

module SuggestPricesRequest =

  //#region SuggestPricesRequest

  [<CLIMutable>]
  type SuggestPricesRequest = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : SuggestOfferPriceDTO[];
  }

  //#endregion
