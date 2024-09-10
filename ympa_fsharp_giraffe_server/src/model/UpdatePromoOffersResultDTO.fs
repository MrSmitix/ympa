namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.RejectedPromoOfferUpdateDTO
open ympa_fsharp_giraffe_server.Model.WarningPromoOfferUpdateDTO

module UpdatePromoOffersResultDTO =

  //#region UpdatePromoOffersResultDTO


  type UpdatePromoOffersResultDTO = {
    RejectedOffers : RejectedPromoOfferUpdateDTO[];
    WarningOffers : WarningPromoOfferUpdateDTO[];
  }
  //#endregion
