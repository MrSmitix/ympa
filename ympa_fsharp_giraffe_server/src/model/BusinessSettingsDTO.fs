namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module BusinessSettingsDTO =

  //#region BusinessSettingsDTO


  type BusinessSettingsDTO = {
    OnlyDefaultPrice : bool;
    Currency : CurrencyType;
  }
  //#endregion
