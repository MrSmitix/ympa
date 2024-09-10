namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module GetPriceDTO =

  //#region GetPriceDTO

  [<CLIMutable>]
  type GetPriceDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "currencyId")>]
    CurrencyId : CurrencyType;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : DateTime;
  }

  //#endregion
