namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReturnInstanceStatusType =

  //#region ReturnInstanceStatusType

  let CREATEDEnum = "CREATED"
  let RECEIVEDEnum = "RECEIVED"
  let INTRANSITEnum = "IN_TRANSIT"
  let READYFORPICKUPEnum = "READY_FOR_PICKUP"
  let PICKEDEnum = "PICKED"
  let RECEIVEDONFULFILLMENTEnum = "RECEIVED_ON_FULFILLMENT"
  let CANCELLEDEnum = "CANCELLED"
  let LOSTEnum = "LOST"
  let UTILIZEDEnum = "UTILIZED"
  let PREPAREDFORUTILIZATIONEnum = "PREPARED_FOR_UTILIZATION"
  let EXPROPRIATEDEnum = "EXPROPRIATED"
  let NOTINDEMANDEnum = "NOT_IN_DEMAND"
  type ReturnInstanceStatusType = string

  //#endregion
