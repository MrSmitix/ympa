namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module PromoOfferDiscountParamsDTO =

  //#region PromoOfferDiscountParamsDTO


  type PromoOfferDiscountParamsDTO = {
    Price : int64;
    PromoPrice : int64;
    MaxPromoPrice : int64;
  }
  //#endregion
