namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.OfferCardDTO

module OfferCardsContentStatusDTO =

  //#region OfferCardsContentStatusDTO


  type OfferCardsContentStatusDTO = {
    OfferCards : OfferCardDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
