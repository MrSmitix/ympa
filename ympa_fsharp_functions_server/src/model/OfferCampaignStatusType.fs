namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferCampaignStatusType =

  //#region OfferCampaignStatusType

  let PUBLISHEDEnum = "PUBLISHED"
  let CHECKINGEnum = "CHECKING"
  let DISABLEDBYPARTNEREnum = "DISABLED_BY_PARTNER"
  let DISABLEDAUTOMATICALLYEnum = "DISABLED_AUTOMATICALLY"
  let REJECTEDBYMARKETEnum = "REJECTED_BY_MARKET"
  let CREATINGCARDEnum = "CREATING_CARD"
  let NOCARDEnum = "NO_CARD"
  let NOSTOCKSEnum = "NO_STOCKS"
  let ARCHIVEDEnum = "ARCHIVED"
  type OfferCampaignStatusType = string

  //#endregion
