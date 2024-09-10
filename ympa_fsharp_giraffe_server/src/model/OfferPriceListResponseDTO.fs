namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferPriceResponseDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module OfferPriceListResponseDTO =

  //#region OfferPriceListResponseDTO


  type OfferPriceListResponseDTO = {
    Offers : OfferPriceResponseDTO[];
    Paging : ScrollingPagerDTO;
    Total : int;
  }
  //#endregion
