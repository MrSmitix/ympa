namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferAvailabilityStatusType =

  //#region OfferAvailabilityStatusType

  let ACTIVEEnum = "ACTIVE"
  let INACTIVEEnum = "INACTIVE"
  let DELISTEDEnum = "DELISTED"
  type OfferAvailabilityStatusType = string

  //#endregion
