namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdatePromoOfferDiscountParamsDTO =

  //#region UpdatePromoOfferDiscountParamsDTO

  [<CLIMutable>]
  type UpdatePromoOfferDiscountParamsDTO = {
    [<JsonProperty(PropertyName = "price")>]
    Price : int64;
    [<JsonProperty(PropertyName = "promoPrice")>]
    PromoPrice : int64;
  }

  //#endregion
