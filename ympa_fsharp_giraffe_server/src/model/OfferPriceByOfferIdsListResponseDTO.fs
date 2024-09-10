namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferPriceByOfferIdsResponseDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module OfferPriceByOfferIdsListResponseDTO =

  //#region OfferPriceByOfferIdsListResponseDTO


  type OfferPriceByOfferIdsListResponseDTO = {
    Offers : OfferPriceByOfferIdsResponseDTO[];
    Paging : ScrollingPagerDTO;
  }
  //#endregion
