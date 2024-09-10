namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PromoOfferUpdateWarningDTO

module WarningPromoOfferUpdateDTO =

  //#region WarningPromoOfferUpdateDTO


  type WarningPromoOfferUpdateDTO = {
    OfferId : string;
    Warnings : PromoOfferUpdateWarningDTO[];
  }
  //#endregion
