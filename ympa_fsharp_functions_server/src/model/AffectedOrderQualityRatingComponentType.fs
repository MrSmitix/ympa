namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AffectedOrderQualityRatingComponentType =

  //#region AffectedOrderQualityRatingComponentType

  let DBSCANCELLATIONRATEEnum = "DBS_CANCELLATION_RATE"
  let DBSLATEDELIVERYRATEEnum = "DBS_LATE_DELIVERY_RATE"
  let FBSCANCELLATIONRATEEnum = "FBS_CANCELLATION_RATE"
  let FBSLATESHIPRATEEnum = "FBS_LATE_SHIP_RATE"
  type AffectedOrderQualityRatingComponentType = string

  //#endregion
