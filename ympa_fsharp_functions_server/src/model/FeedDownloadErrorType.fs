namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedDownloadErrorType =

  //#region FeedDownloadErrorType

  let ERROREnum = "DOWNLOAD_ERROR"
  let HTTPERROREnum = "DOWNLOAD_HTTP_ERROR"
  type FeedDownloadErrorType = string

  //#endregion
