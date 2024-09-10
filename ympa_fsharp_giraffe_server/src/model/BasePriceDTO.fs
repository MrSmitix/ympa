namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module BasePriceDTO =

  //#region BasePriceDTO


  type BasePriceDTO = {
    Value : decimal;
    CurrencyId : CurrencyType;
  }
  //#endregion
