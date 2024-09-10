namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReportFormatType =

  //#region ReportFormatType

  let FILEEnum = "FILE"
  let CSVEnum = "CSV"
  type ReportFormatType = string

  //#endregion
