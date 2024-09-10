namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferCardStatusType =

  //#region OfferCardStatusType

  let HASCARDCANNOTUPDATEEnum = "HAS_CARD_CAN_NOT_UPDATE"
  let HASCARDCANUPDATEEnum = "HAS_CARD_CAN_UPDATE"
  let HASCARDCANUPDATEERRORSEnum = "HAS_CARD_CAN_UPDATE_ERRORS"
  let HASCARDCANUPDATEPROCESSINGEnum = "HAS_CARD_CAN_UPDATE_PROCESSING"
  let NOCARDNEEDCONTENTEnum = "NO_CARD_NEED_CONTENT"
  let NOCARDMARKETWILLCREATEEnum = "NO_CARD_MARKET_WILL_CREATE"
  let NOCARDERRORSEnum = "NO_CARD_ERRORS"
  let NOCARDPROCESSINGEnum = "NO_CARD_PROCESSING"
  let NOCARDADDTOCAMPAIGNEnum = "NO_CARD_ADD_TO_CAMPAIGN"
  type OfferCardStatusType = string

  //#endregion
