namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CalculatedTariffType =

  //#region CalculatedTariffType

  let AGENCYCOMMISSIONEnum = "AGENCY_COMMISSION"
  let PAYMENTTRANSFEREnum = "PAYMENT_TRANSFER"
  let FEEEnum = "FEE"
  let DELIVERYTOCUSTOMEREnum = "DELIVERY_TO_CUSTOMER"
  let CROSSREGIONALDELIVERYEnum = "CROSSREGIONAL_DELIVERY"
  let EXPRESSDELIVERYEnum = "EXPRESS_DELIVERY"
  let SORTINGEnum = "SORTING"
  let MIDDLEMILEEnum = "MIDDLE_MILE"
  type CalculatedTariffType = string

  //#endregion
