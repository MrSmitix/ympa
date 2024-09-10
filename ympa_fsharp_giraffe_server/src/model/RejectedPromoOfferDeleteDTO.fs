namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.RejectedPromoOfferDeleteReasonType

module RejectedPromoOfferDeleteDTO =

  //#region RejectedPromoOfferDeleteDTO


  type RejectedPromoOfferDeleteDTO = {
    OfferId : string;
    Reason : RejectedPromoOfferDeleteReasonType;
  }
  //#endregion
