namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceSuggestOfferDTO

module SuggestPricesResultDTO =

  //#region SuggestPricesResultDTO


  type SuggestPricesResultDTO = {
    Offers : PriceSuggestOfferDTO[];
  }
  //#endregion
