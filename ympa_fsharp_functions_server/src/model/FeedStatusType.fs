namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedStatusType =

  //#region FeedStatusType

  let ERROREnum = "ERROR"
  let NAEnum = "NA"
  let OKEnum = "OK"
  type FeedStatusType = string

  //#endregion
