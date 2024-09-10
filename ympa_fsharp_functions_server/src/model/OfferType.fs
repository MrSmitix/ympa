namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferType =

  //#region OfferType

  let DEFAULTEnum = "DEFAULT"
  let MEDICINEEnum = "MEDICINE"
  let BOOKEnum = "BOOK"
  let AUDIOBOOKEnum = "AUDIOBOOK"
  let ARTISTTITLEEnum = "ARTIST_TITLE"
  let ONDEMANDEnum = "ON_DEMAND"
  type OfferType = string

  //#endregion
