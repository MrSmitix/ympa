namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReportStatusType =

  //#region ReportStatusType

  let PENDINGEnum = "PENDING"
  let PROCESSINGEnum = "PROCESSING"
  let FAILEDEnum = "FAILED"
  let DONEEnum = "DONE"
  type ReportStatusType = string

  //#endregion
