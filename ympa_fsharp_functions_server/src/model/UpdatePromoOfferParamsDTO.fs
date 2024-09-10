namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdatePromoOfferDiscountParamsDTO

module UpdatePromoOfferParamsDTO =

  //#region UpdatePromoOfferParamsDTO

  [<CLIMutable>]
  type UpdatePromoOfferParamsDTO = {
    [<JsonProperty(PropertyName = "discountParams")>]
    DiscountParams : UpdatePromoOfferDiscountParamsDTO;
  }

  //#endregion
