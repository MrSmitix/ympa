namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module CalculateTariffsOfferDTO =

  //#region CalculateTariffsOfferDTO


  type CalculateTariffsOfferDTO = {
    CategoryId : int64;
    Price : decimal;
    Length : decimal;
    Width : decimal;
    Height : decimal;
    Weight : decimal;
    Quantity : int;
  }
  //#endregion
