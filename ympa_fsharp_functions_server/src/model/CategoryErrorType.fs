namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CategoryErrorType =

  //#region CategoryErrorType

  let UNKNOWNCATEGORYEnum = "UNKNOWN_CATEGORY"
  let CATEGORYISNOTLEAFEnum = "CATEGORY_IS_NOT_LEAF"
  type CategoryErrorType = string

  //#endregion
