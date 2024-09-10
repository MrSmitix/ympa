namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsCommissionType =

  //#region OrdersStatsCommissionType

  let FEEEnum = "FEE"
  let FULFILLMENTEnum = "FULFILLMENT"
  let LOYALTYPARTICIPATIONFEEEnum = "LOYALTY_PARTICIPATION_FEE"
  let AUCTIONPROMOTIONEnum = "AUCTION_PROMOTION"
  let INSTALLMENTEnum = "INSTALLMENT"
  let DELIVERYTOCUSTOMEREnum = "DELIVERY_TO_CUSTOMER"
  let EXPRESSDELIVERYTOCUSTOMEREnum = "EXPRESS_DELIVERY_TO_CUSTOMER"
  let AGENCYEnum = "AGENCY"
  let PAYMENTTRANSFEREnum = "PAYMENT_TRANSFER"
  let RETURNEDORDERSSTORAGEEnum = "RETURNED_ORDERS_STORAGE"
  let SORTINGEnum = "SORTING"
  let INTAKESORTINGEnum = "INTAKE_SORTING"
  let RETURNPROCESSINGEnum = "RETURN_PROCESSING"
  let ILLIQUIDGOODSSALEEnum = "ILLIQUID_GOODS_SALE"
  type OrdersStatsCommissionType = string

  //#endregion
