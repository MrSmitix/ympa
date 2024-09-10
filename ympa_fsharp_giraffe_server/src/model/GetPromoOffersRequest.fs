namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PromoOfferParticipationStatusFilterType

module GetPromoOffersRequest =

  //#region GetPromoOffersRequest


  type GetPromoOffersRequest = {
    PromoId : string;
    StatusType : PromoOfferParticipationStatusFilterType;
  }
  //#endregion
