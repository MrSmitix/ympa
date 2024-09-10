namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PromoOfferUpdateWarningCodeType

module PromoOfferUpdateWarningDTO =

  //#region PromoOfferUpdateWarningDTO


  type PromoOfferUpdateWarningDTO = {
    Code : PromoOfferUpdateWarningCodeType;
    CampaignIds : int64[];
  }
  //#endregion
