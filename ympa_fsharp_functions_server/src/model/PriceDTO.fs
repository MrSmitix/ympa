namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module PriceDTO =

  //#region PriceDTO

  [<CLIMutable>]
  type PriceDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "discountBase")>]
    DiscountBase : decimal;
    [<JsonProperty(PropertyName = "currencyId")>]
    CurrencyId : CurrencyType;
    [<JsonProperty(PropertyName = "vat")>]
    Vat : int;
  }

  //#endregion
