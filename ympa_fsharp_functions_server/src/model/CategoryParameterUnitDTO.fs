namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UnitDTO

module CategoryParameterUnitDTO =

  //#region CategoryParameterUnitDTO

  [<CLIMutable>]
  type CategoryParameterUnitDTO = {
    [<JsonProperty(PropertyName = "defaultUnitId")>]
    DefaultUnitId : int64;
    [<JsonProperty(PropertyName = "units")>]
    Units : UnitDTO[];
  }

  //#endregion
