namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferCardRecommendationType =

  //#region OfferCardRecommendationType

  let HASVIDEOEnum = "HAS_VIDEO"
  let RECOGNIZEDVENDOREnum = "RECOGNIZED_VENDOR"
  let MAINEnum = "MAIN"
  let ADDITIONALEnum = "ADDITIONAL"
  let DISTINCTIVEEnum = "DISTINCTIVE"
  let FILTERABLEEnum = "FILTERABLE"
  let PICTURECOUNTEnum = "PICTURE_COUNT"
  let HASDESCRIPTIONEnum = "HAS_DESCRIPTION"
  let HASBARCODEEnum = "HAS_BARCODE"
  let FIRSTPICTURESIZEEnum = "FIRST_PICTURE_SIZE"
  let TITLELENGTHEnum = "TITLE_LENGTH"
  let DESCRIPTIONLENGTHEnum = "DESCRIPTION_LENGTH"
  let AVERAGEPICTURESIZEEnum = "AVERAGE_PICTURE_SIZE"
  let FIRSTVIDEOSIZEEnum = "FIRST_VIDEO_SIZE"
  let FIRSTVIDEOLENGTHEnum = "FIRST_VIDEO_LENGTH"
  let AVERAGEVIDEOSIZEEnum = "AVERAGE_VIDEO_SIZE"
  let VIDEOCOUNTEnum = "VIDEO_COUNT"
  type OfferCardRecommendationType = string

  //#endregion
