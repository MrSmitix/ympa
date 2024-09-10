namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferMappingErrorType =

  //#region OfferMappingErrorType

  let UNKNOWNCATEGORYEnum = "UNKNOWN_CATEGORY"
  let CATEGORYMISMATCHEnum = "CATEGORY_MISMATCH"
  let EMPTYMARKETCATEGORYEnum = "EMPTY_MARKET_CATEGORY"
  let UNKNOWNPARAMETEREnum = "UNKNOWN_PARAMETER"
  let UNEXPECTEDBOOLEANVALUEEnum = "UNEXPECTED_BOOLEAN_VALUE"
  let NUMBERFORMATEnum = "NUMBER_FORMAT"
  let VALUEBLANKEnum = "VALUE_BLANK"
  let INVALIDUNITIDEnum = "INVALID_UNIT_ID"
  let INVALIDGROUPIDLENGTHEnum = "INVALID_GROUP_ID_LENGTH"
  let INVALIDGROUPIDCHARACTERSEnum = "INVALID_GROUP_ID_CHARACTERS"
  let INVALIDPICKERURLEnum = "INVALID_PICKER_URL"
  type OfferMappingErrorType = string

  //#endregion
