namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PromoOfferParticipationStatusType =

  //#region PromoOfferParticipationStatusType

  let AUTOEnum = "AUTO"
  let PARTIALLYAUTOEnum = "PARTIALLY_AUTO"
  let MANUALEnum = "MANUAL"
  let NOTPARTICIPATINGEnum = "NOT_PARTICIPATING"
  type PromoOfferParticipationStatusType = string

  //#endregion
