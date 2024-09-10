namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GoodsFeedbackCommentStatusType =

  //#region GoodsFeedbackCommentStatusType

  let PUBLISHEDEnum = "PUBLISHED"
  let UNMODERATEDEnum = "UNMODERATED"
  let BANNEDEnum = "BANNED"
  let DELETEDEnum = "DELETED"
  type GoodsFeedbackCommentStatusType = string

  //#endregion
