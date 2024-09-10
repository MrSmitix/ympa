namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferConditionType =

  //#region OfferConditionType

  let PREOWNEDEnum = "PREOWNED"
  let SHOWCASESAMPLEEnum = "SHOWCASESAMPLE"
  let REFURBISHEDEnum = "REFURBISHED"
  let REDUCTIONEnum = "REDUCTION"
  let RENOVATEDEnum = "RENOVATED"
  let NOTSPECIFIEDEnum = "NOT_SPECIFIED"
  type OfferConditionType = string

  //#endregion
