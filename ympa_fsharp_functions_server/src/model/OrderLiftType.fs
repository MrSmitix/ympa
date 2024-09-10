namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderLiftType =

  //#region OrderLiftType

  let NOTNEEDEDEnum = "NOT_NEEDED"
  let MANUALEnum = "MANUAL"
  let ELEVATOREnum = "ELEVATOR"
  let CARGOELEVATOREnum = "CARGO_ELEVATOR"
  let FREEEnum = "FREE"
  let UNKNOWNEnum = "UNKNOWN"
  type OrderLiftType = string

  //#endregion
