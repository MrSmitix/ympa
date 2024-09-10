namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module GetPriceWithDiscountDTO =

  //#region GetPriceWithDiscountDTO

  [<CLIMutable>]
  type GetPriceWithDiscountDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "currencyId")>]
    CurrencyId : CurrencyType;
    [<JsonProperty(PropertyName = "discountBase")>]
    DiscountBase : decimal;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : DateTime;
  }

  //#endregion
