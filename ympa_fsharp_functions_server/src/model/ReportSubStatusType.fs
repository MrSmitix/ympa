namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReportSubStatusType =

  //#region ReportSubStatusType

  let NODATAEnum = "NO_DATA"
  let TOOLARGEEnum = "TOO_LARGE"
  let RESOURCENOTFOUNDEnum = "RESOURCE_NOT_FOUND"
  type ReportSubStatusType = string

  //#endregion
