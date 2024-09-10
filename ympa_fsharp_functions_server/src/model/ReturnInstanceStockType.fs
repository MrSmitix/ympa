namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReturnInstanceStockType =

  //#region ReturnInstanceStockType

  let FITEnum = "FIT"
  let DEFECTEnum = "DEFECT"
  let ANOMALYEnum = "ANOMALY"
  let SURPLUSEnum = "SURPLUS"
  let EXPIREDEnum = "EXPIRED"
  let MISGRADINGEnum = "MISGRADING"
  let UNDEFINEDEnum = "UNDEFINED"
  let INCORRECTIMEIEnum = "INCORRECT_IMEI"
  let INCORRECTSERIALNUMBEREnum = "INCORRECT_SERIAL_NUMBER"
  let INCORRECTCISEnum = "INCORRECT_CIS"
  let PARTMISSINGEnum = "PART_MISSING"
  let NONCOMPLIENTEnum = "NON_COMPLIENT"
  let NOTACCEPTABLEEnum = "NOT_ACCEPTABLE"
  let SERVICEEnum = "SERVICE"
  let MARKDOWNEnum = "MARKDOWN"
  let DEMOEnum = "DEMO"
  let REPAIREnum = "REPAIR"
  let FIRMWAREEnum = "FIRMWARE"
  let UNKNOWNEnum = "UNKNOWN"
  type ReturnInstanceStockType = string

  //#endregion
