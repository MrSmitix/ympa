namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ParameterType =

  //#region ParameterType

  let TEXTEnum = "TEXT"
  let ENUMEnum = "ENUM"
  let BOOLEANEnum = "BOOLEAN"
  let NUMERICEnum = "NUMERIC"
  type ParameterType = string

  //#endregion
