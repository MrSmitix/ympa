namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceQuarantineVerdictParameterDTO
open ympa_fsharp_giraffe_server.Model.PriceQuarantineVerdictType

module PriceQuarantineVerdictDTO =

  //#region PriceQuarantineVerdictDTO


  type PriceQuarantineVerdictDTO = {
    Type : PriceQuarantineVerdictType;
    Params : PriceQuarantineVerdictParameterDTO[];
  }
  //#endregion
