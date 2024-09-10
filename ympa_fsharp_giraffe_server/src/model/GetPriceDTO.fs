namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module GetPriceDTO =

  //#region GetPriceDTO


  type GetPriceDTO = {
    Value : decimal;
    CurrencyId : CurrencyType;
    UpdatedAt : DateTime;
  }
  //#endregion
