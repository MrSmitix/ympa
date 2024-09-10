namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ApiResponseStatusType =

  //#region ApiResponseStatusType

  let OKEnum = "OK"
  let ERROREnum = "ERROR"
  type ApiResponseStatusType = string

  //#endregion
