namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedIndexLogsErrorType =

  //#region FeedIndexLogsErrorType

  let DOWNLOADERROREnum = "DOWNLOAD_ERROR"
  let DOWNLOADHTTPERROREnum = "DOWNLOAD_HTTP_ERROR"
  let PARSEERROREnum = "PARSE_ERROR"
  let PARSEXMLERROREnum = "PARSE_XML_ERROR"
  let TOOMANYREJECTEDOFFERSEnum = "TOO_MANY_REJECTED_OFFERS"
  let NOTINDEXEDEnum = "NOT_INDEXED"
  type FeedIndexLogsErrorType = string

  //#endregion
