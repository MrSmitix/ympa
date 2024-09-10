namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdatePromoOfferDiscountParamsDTO

module UpdatePromoOfferParamsDTO =

  //#region UpdatePromoOfferParamsDTO


  type UpdatePromoOfferParamsDTO = {
    DiscountParams : UpdatePromoOfferDiscountParamsDTO;
  }
  //#endregion
