namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UnitDTO

module CategoryParameterUnitDTO =

  //#region CategoryParameterUnitDTO


  type CategoryParameterUnitDTO = {
    DefaultUnitId : int64;
    Units : UnitDTO[];
  }
  //#endregion
