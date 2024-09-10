namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module BusinessSettingsDTO =

  //#region BusinessSettingsDTO

  [<CLIMutable>]
  type BusinessSettingsDTO = {
    [<JsonProperty(PropertyName = "onlyDefaultPrice")>]
    OnlyDefaultPrice : bool;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
  }

  //#endregion
