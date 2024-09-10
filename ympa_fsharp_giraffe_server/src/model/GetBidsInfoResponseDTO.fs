namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.SkuBidItemDTO

module GetBidsInfoResponseDTO =

  //#region GetBidsInfoResponseDTO


  type GetBidsInfoResponseDTO = {
    Bids : SkuBidItemDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
