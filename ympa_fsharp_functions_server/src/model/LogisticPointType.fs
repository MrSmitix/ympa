namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LogisticPointType =

  //#region LogisticPointType

  let WAREHOUSEEnum = "WAREHOUSE"
  let PICKUPPOINTEnum = "PICKUP_POINT"
  let PICKUPTERMINALEnum = "PICKUP_TERMINAL"
  let PICKUPPOSTOFFICEEnum = "PICKUP_POST_OFFICE"
  let PICKUPMIXEDEnum = "PICKUP_MIXED"
  let PICKUPRETAILEnum = "PICKUP_RETAIL"
  let UNKNOWNEnum = "UNKNOWN"
  type LogisticPointType = string

  //#endregion
