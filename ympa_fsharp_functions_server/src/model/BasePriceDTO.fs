namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module BasePriceDTO =

  //#region BasePriceDTO

  [<CLIMutable>]
  type BasePriceDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "currencyId")>]
    CurrencyId : CurrencyType;
  }

  //#endregion
