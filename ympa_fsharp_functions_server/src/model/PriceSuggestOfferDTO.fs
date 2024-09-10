namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceSuggestDTO

module PriceSuggestOfferDTO =

  //#region PriceSuggestOfferDTO

  [<CLIMutable>]
  type PriceSuggestOfferDTO = {
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "priceSuggestion")>]
    PriceSuggestion : PriceSuggestDTO[];
  }

  //#endregion
