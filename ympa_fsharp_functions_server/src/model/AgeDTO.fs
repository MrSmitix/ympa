namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.AgeUnitType

module AgeDTO =

  //#region AgeDTO

  [<CLIMutable>]
  type AgeDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "ageUnit")>]
    AgeUnit : AgeUnitType;
  }

  //#endregion
