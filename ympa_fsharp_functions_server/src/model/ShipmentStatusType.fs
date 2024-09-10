namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ShipmentStatusType =

  //#region ShipmentStatusType

  let OUTBOUNDCREATEDEnum = "OUTBOUND_CREATED"
  let OUTBOUNDREADYFORCONFIRMATIONEnum = "OUTBOUND_READY_FOR_CONFIRMATION"
  let OUTBOUNDCONFIRMEDEnum = "OUTBOUND_CONFIRMED"
  let OUTBOUNDSIGNEDEnum = "OUTBOUND_SIGNED"
  let FINISHEDEnum = "FINISHED"
  let ACCEPTEDEnum = "ACCEPTED"
  let ACCEPTEDWITHDISCREPANCIESEnum = "ACCEPTED_WITH_DISCREPANCIES"
  let ERROREnum = "ERROR"
  type ShipmentStatusType = string

  //#endregion
