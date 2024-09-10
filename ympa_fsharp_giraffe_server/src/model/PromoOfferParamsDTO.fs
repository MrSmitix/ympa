namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PromoOfferDiscountParamsDTO
open ympa_fsharp_giraffe_server.Model.PromoOfferPromocodeParamsDTO

module PromoOfferParamsDTO =

  //#region PromoOfferParamsDTO


  type PromoOfferParamsDTO = {
    DiscountParams : PromoOfferDiscountParamsDTO;
    PromocodeParams : PromoOfferPromocodeParamsDTO;
  }
  //#endregion
