namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AgeUnitType

module AgeDTO =

  //#region AgeDTO


  type AgeDTO = {
    Value : decimal;
    AgeUnit : AgeUnitType;
  }
  //#endregion
