namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PromoOfferAutoParticipatingDetailsDTO
open ympa_fsharp_giraffe_server.Model.PromoOfferParamsDTO
open ympa_fsharp_giraffe_server.Model.PromoOfferParticipationStatusType

module GetPromoOfferDTO =

  //#region GetPromoOfferDTO


  type GetPromoOfferDTO = {
    OfferId : string;
    Status : PromoOfferParticipationStatusType;
    Params : PromoOfferParamsDTO;
    AutoParticipatingDetails : PromoOfferAutoParticipatingDetailsDTO;
  }
  //#endregion
