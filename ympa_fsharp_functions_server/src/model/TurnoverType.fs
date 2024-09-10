namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TurnoverType =

  //#region TurnoverType

  let LOWEnum = "LOW"
  let ALMOSTLOWEnum = "ALMOST_LOW"
  let HIGHEnum = "HIGH"
  let VERYHIGHEnum = "VERY_HIGH"
  let NOSALESEnum = "NO_SALES"
  let FREESTOREEnum = "FREE_STORE"
  type TurnoverType = string

  //#endregion
