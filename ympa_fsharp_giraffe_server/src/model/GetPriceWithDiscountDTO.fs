namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module GetPriceWithDiscountDTO =

  //#region GetPriceWithDiscountDTO


  type GetPriceWithDiscountDTO = {
    Value : decimal;
    CurrencyId : CurrencyType;
    DiscountBase : decimal;
    UpdatedAt : DateTime;
  }
  //#endregion
