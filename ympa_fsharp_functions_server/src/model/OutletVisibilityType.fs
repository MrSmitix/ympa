namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OutletVisibilityType =

  //#region OutletVisibilityType

  let HIDDENEnum = "HIDDEN"
  let VISIBLEEnum = "VISIBLE"
  let UNKNOWNEnum = "UNKNOWN"
  type OutletVisibilityType = string

  //#endregion
