namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module WarehouseStockType =

  //#region WarehouseStockType

  let FITEnum = "FIT"
  let FREEZEEnum = "FREEZE"
  let AVAILABLEEnum = "AVAILABLE"
  let QUARANTINEEnum = "QUARANTINE"
  let UTILIZATIONEnum = "UTILIZATION"
  let DEFECTEnum = "DEFECT"
  let EXPIREDEnum = "EXPIRED"
  type WarehouseStockType = string

  //#endregion
