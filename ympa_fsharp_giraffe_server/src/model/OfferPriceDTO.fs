namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceDTO

module OfferPriceDTO =

  //#region OfferPriceDTO


  type OfferPriceDTO = {
    OfferId : string;
    Price : PriceDTO;
  }
  //#endregion
