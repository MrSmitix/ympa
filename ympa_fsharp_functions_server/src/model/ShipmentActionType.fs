namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ShipmentActionType =

  //#region ShipmentActionType

  let CONFIRMEnum = "CONFIRM"
  let DOWNLOADACTEnum = "DOWNLOAD_ACT"
  let DOWNLOADINBOUNDACTEnum = "DOWNLOAD_INBOUND_ACT"
  let DOWNLOADDISCREPANCYACTEnum = "DOWNLOAD_DISCREPANCY_ACT"
  let CHANGEPALLETSCOUNTEnum = "CHANGE_PALLETS_COUNT"
  type ShipmentActionType = string

  //#endregion
