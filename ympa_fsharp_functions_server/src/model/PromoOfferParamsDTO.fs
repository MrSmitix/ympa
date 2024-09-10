namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PromoOfferDiscountParamsDTO
open ympa_fsharp_functions_server.Model.PromoOfferPromocodeParamsDTO

module PromoOfferParamsDTO =

  //#region PromoOfferParamsDTO

  [<CLIMutable>]
  type PromoOfferParamsDTO = {
    [<JsonProperty(PropertyName = "discountParams")>]
    DiscountParams : PromoOfferDiscountParamsDTO;
    [<JsonProperty(PropertyName = "promocodeParams")>]
    PromocodeParams : PromoOfferPromocodeParamsDTO;
  }

  //#endregion
