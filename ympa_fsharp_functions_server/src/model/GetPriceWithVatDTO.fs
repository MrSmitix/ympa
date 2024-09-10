namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module GetPriceWithVatDTO =

  //#region GetPriceWithVatDTO

  [<CLIMutable>]
  type GetPriceWithVatDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "discountBase")>]
    DiscountBase : decimal;
    [<JsonProperty(PropertyName = "currencyId")>]
    CurrencyId : CurrencyType;
    [<JsonProperty(PropertyName = "vat")>]
    Vat : int;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : DateTime;
  }

  //#endregion
