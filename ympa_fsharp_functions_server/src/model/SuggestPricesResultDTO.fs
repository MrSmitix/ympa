namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceSuggestOfferDTO

module SuggestPricesResultDTO =

  //#region SuggestPricesResultDTO

  [<CLIMutable>]
  type SuggestPricesResultDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : PriceSuggestOfferDTO[];
  }

  //#endregion
