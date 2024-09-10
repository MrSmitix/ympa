namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module UpdatePriceWithDiscountDTO =

  //#region UpdatePriceWithDiscountDTO


  type UpdatePriceWithDiscountDTO = {
    Value : decimal;
    CurrencyId : CurrencyType;
    DiscountBase : decimal;
  }
  //#endregion
