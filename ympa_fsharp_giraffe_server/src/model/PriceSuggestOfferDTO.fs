namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceSuggestDTO

module PriceSuggestOfferDTO =

  //#region PriceSuggestOfferDTO


  type PriceSuggestOfferDTO = {
    MarketSku : int64;
    OfferId : string;
    PriceSuggestion : PriceSuggestDTO[];
  }
  //#endregion
