namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReturnShipmentStatusType =

  //#region ReturnShipmentStatusType

  let CREATEDEnum = "CREATED"
  let RECEIVEDEnum = "RECEIVED"
  let INTRANSITEnum = "IN_TRANSIT"
  let READYFORPICKUPEnum = "READY_FOR_PICKUP"
  let PICKEDEnum = "PICKED"
  let LOSTEnum = "LOST"
  let EXPIREDEnum = "EXPIRED"
  let CANCELLEDEnum = "CANCELLED"
  let FULFILMENTRECEIVEDEnum = "FULFILMENT_RECEIVED"
  let PREPAREDFORUTILIZATIONEnum = "PREPARED_FOR_UTILIZATION"
  let NOTINDEMANDEnum = "NOT_IN_DEMAND"
  let UTILIZEDEnum = "UTILIZED"
  let READYFOREXPROPRIATIONEnum = "READY_FOR_EXPROPRIATION"
  let RECEIVEDFOREXPROPRIATIONEnum = "RECEIVED_FOR_EXPROPRIATION"
  type ReturnShipmentStatusType = string

  //#endregion
