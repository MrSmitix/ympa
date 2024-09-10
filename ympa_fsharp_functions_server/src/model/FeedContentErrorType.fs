namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedContentErrorType =

  //#region FeedContentErrorType

  let PARSEERROREnum = "PARSE_ERROR"
  let PARSEXMLERROREnum = "PARSE_XML_ERROR"
  let TOOMANYREJECTEDOFFERSEnum = "TOO_MANY_REJECTED_OFFERS"
  type FeedContentErrorType = string

  //#endregion
