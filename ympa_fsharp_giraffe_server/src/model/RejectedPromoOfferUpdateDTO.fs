namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.RejectedPromoOfferUpdateReasonType

module RejectedPromoOfferUpdateDTO =

  //#region RejectedPromoOfferUpdateDTO


  type RejectedPromoOfferUpdateDTO = {
    OfferId : string;
    Reason : RejectedPromoOfferUpdateReasonType;
  }
  //#endregion
