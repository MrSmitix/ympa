namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OutletStatusType =

  //#region OutletStatusType

  let ATMODERATIONEnum = "AT_MODERATION"
  let FAILEDEnum = "FAILED"
  let MODERATEDEnum = "MODERATED"
  let NONMODERATEDEnum = "NONMODERATED"
  let UNKNOWNEnum = "UNKNOWN"
  type OutletStatusType = string

  //#endregion
