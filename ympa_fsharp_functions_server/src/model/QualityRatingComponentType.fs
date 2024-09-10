namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module QualityRatingComponentType =

  //#region QualityRatingComponentType

  let DBSCANCELLATIONRATEEnum = "DBS_CANCELLATION_RATE"
  let DBSLATEDELIVERYRATEEnum = "DBS_LATE_DELIVERY_RATE"
  let FBSCANCELLATIONRATEEnum = "FBS_CANCELLATION_RATE"
  let FBSLATESHIPRATEEnum = "FBS_LATE_SHIP_RATE"
  let FBYLATEDELIVERYRATEEnum = "FBY_LATE_DELIVERY_RATE"
  let FBYCANCELLATIONRATEEnum = "FBY_CANCELLATION_RATE"
  let FBYDELIVERYDIFFRATEEnum = "FBY_DELIVERY_DIFF_RATE"
  let FBYLATEEDITINGRATEEnum = "FBY_LATE_EDITING_RATE"
  type QualityRatingComponentType = string

  //#endregion
