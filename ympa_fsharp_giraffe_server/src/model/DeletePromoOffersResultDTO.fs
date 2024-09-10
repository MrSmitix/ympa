namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.RejectedPromoOfferDeleteDTO

module DeletePromoOffersResultDTO =

  //#region DeletePromoOffersResultDTO


  type DeletePromoOffersResultDTO = {
    RejectedOffers : RejectedPromoOfferDeleteDTO[];
  }
  //#endregion
