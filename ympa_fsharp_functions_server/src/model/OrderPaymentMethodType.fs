namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderPaymentMethodType =

  //#region OrderPaymentMethodType

  let CASHONDELIVERYEnum = "CASH_ON_DELIVERY"
  let CARDONDELIVERYEnum = "CARD_ON_DELIVERY"
  let BOUNDCARDONDELIVERYEnum = "BOUND_CARD_ON_DELIVERY"
  let YANDEXEnum = "YANDEX"
  let APPLEPAYEnum = "APPLE_PAY"
  let EXTERNALCERTIFICATEEnum = "EXTERNAL_CERTIFICATE"
  let CREDITEnum = "CREDIT"
  let GOOGLEPAYEnum = "GOOGLE_PAY"
  let TINKOFFCREDITEnum = "TINKOFF_CREDIT"
  let SBPEnum = "SBP"
  let TINKOFFINSTALLMENTSEnum = "TINKOFF_INSTALLMENTS"
  let B2BACCOUNTPREPAYMENTEnum = "B2B_ACCOUNT_PREPAYMENT"
  let B2BACCOUNTPOSTPAYMENTEnum = "B2B_ACCOUNT_POSTPAYMENT"
  let UNKNOWNEnum = "UNKNOWN"
  type OrderPaymentMethodType = string

  //#endregion
