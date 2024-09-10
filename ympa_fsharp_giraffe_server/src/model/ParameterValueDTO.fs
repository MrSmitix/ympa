namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ParameterValueDTO =

  //#region ParameterValueDTO


  type ParameterValueDTO = {
    ParameterId : int64;
    UnitId : int64;
    ValueId : int64;
    Value : string;
  }
  //#endregion
