namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PromoOfferDiscountParamsDTO =

  //#region PromoOfferDiscountParamsDTO

  [<CLIMutable>]
  type PromoOfferDiscountParamsDTO = {
    [<JsonProperty(PropertyName = "price")>]
    Price : int64;
    [<JsonProperty(PropertyName = "promoPrice")>]
    PromoPrice : int64;
    [<JsonProperty(PropertyName = "maxPromoPrice")>]
    MaxPromoPrice : int64;
  }

  //#endregion
