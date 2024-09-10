namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedbackStateType =

  //#region FeedbackStateType

  let LASTEnum = "LAST"
  let PREVIOUSEnum = "PREVIOUS"
  let DELETEDEnum = "DELETED"
  type FeedbackStateType = string

  //#endregion
