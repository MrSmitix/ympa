namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ParameterValueConstraintsDTO =

  //#region ParameterValueConstraintsDTO


  type ParameterValueConstraintsDTO = {
    MinValue : double;
    MaxValue : double;
    MaxLength : int;
  }
  //#endregion
