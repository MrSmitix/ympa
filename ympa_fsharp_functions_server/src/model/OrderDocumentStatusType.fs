namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDocumentStatusType =

  //#region OrderDocumentStatusType

  let READYEnum = "READY"
  let NOTREADYEnum = "NOT_READY"
  type OrderDocumentStatusType = string

  //#endregion
