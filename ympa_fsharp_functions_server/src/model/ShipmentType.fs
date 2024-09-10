namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ShipmentType =

  //#region ShipmentType

  let IMPORTEnum = "IMPORT"
  let WITHDRAWEnum = "WITHDRAW"
  type ShipmentType = string

  //#endregion
