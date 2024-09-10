namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.HiddenOfferDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module GetHiddenOffersResultDTO =

  //#region GetHiddenOffersResultDTO


  type GetHiddenOffersResultDTO = {
    Paging : ScrollingPagerDTO;
    HiddenOffers : HiddenOfferDTO[];
  }
  //#endregion
