namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.GetPromoOfferDTO

module GetPromoOffersResultDTO =

  //#region GetPromoOffersResultDTO


  type GetPromoOffersResultDTO = {
    Offers : GetPromoOfferDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
