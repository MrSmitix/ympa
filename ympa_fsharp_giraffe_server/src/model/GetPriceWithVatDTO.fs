namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module GetPriceWithVatDTO =

  //#region GetPriceWithVatDTO


  type GetPriceWithVatDTO = {
    Value : decimal;
    DiscountBase : decimal;
    CurrencyId : CurrencyType;
    Vat : int;
    UpdatedAt : DateTime;
  }
  //#endregion
