namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceSuggestType

module PriceSuggestDTO =

  //#region PriceSuggestDTO


  type PriceSuggestDTO = {
    Type : PriceSuggestType;
    Price : decimal;
  }
  //#endregion
