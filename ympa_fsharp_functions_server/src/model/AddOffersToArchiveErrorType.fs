namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AddOffersToArchiveErrorType =

  //#region AddOffersToArchiveErrorType

  let OFFERHASSTOCKSEnum = "OFFER_HAS_STOCKS"
  let UNKNOWNEnum = "UNKNOWN"
  type AddOffersToArchiveErrorType = string

  //#endregion
