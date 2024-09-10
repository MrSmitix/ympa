namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module PriceDTO =

  //#region PriceDTO


  type PriceDTO = {
    Value : decimal;
    DiscountBase : decimal;
    CurrencyId : CurrencyType;
    Vat : int;
  }
  //#endregion
