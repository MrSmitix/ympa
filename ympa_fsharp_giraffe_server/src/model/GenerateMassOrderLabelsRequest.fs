namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set

module GenerateMassOrderLabelsRequest =

  //#region GenerateMassOrderLabelsRequest


  type GenerateMassOrderLabelsRequest = {
    BusinessId : int64;
    OrderIds : int64[];
  }
  //#endregion
