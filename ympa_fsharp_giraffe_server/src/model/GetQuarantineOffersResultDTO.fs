namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QuarantineOfferDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module GetQuarantineOffersResultDTO =

  //#region GetQuarantineOffersResultDTO


  type GetQuarantineOffersResultDTO = {
    Paging : ScrollingPagerDTO;
    Offers : QuarantineOfferDTO[];
  }
  //#endregion
