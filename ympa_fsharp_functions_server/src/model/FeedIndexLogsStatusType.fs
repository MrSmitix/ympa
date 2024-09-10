namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedIndexLogsStatusType =

  //#region FeedIndexLogsStatusType

  let ERROREnum = "ERROR"
  let OKEnum = "OK"
  let WARNINGEnum = "WARNING"
  type FeedIndexLogsStatusType = string

  //#endregion
