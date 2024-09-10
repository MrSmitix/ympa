namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module UpdatePriceWithDiscountDTO =

  //#region UpdatePriceWithDiscountDTO

  [<CLIMutable>]
  type UpdatePriceWithDiscountDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "currencyId")>]
    CurrencyId : CurrencyType;
    [<JsonProperty(PropertyName = "discountBase")>]
    DiscountBase : decimal;
  }

  //#endregion
