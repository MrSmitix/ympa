namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.PriceQuarantineVerdictParamNameType

module PriceQuarantineVerdictParameterDTO =

  //#region PriceQuarantineVerdictParameterDTO


  type PriceQuarantineVerdictParameterDTO = {
    Name : PriceQuarantineVerdictParamNameType;
    Value : string;
  }
  //#endregion
