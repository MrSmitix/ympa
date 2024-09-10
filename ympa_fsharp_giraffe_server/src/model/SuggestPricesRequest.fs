namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.SuggestOfferPriceDTO

module SuggestPricesRequest =

  //#region SuggestPricesRequest


  type SuggestPricesRequest = {
    Offers : SuggestOfferPriceDTO[];
  }
  //#endregion
