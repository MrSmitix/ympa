namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module SuggestOfferPriceDTO =

  //#region SuggestOfferPriceDTO


  type SuggestOfferPriceDTO = {
    OfferId : string;
    MarketSku : int64;
  }
  //#endregion
