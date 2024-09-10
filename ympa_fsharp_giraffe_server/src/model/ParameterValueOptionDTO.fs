namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ParameterValueOptionDTO =

  //#region ParameterValueOptionDTO


  type ParameterValueOptionDTO = {
    Id : int64;
    Value : string;
    Description : string;
  }
  //#endregion
