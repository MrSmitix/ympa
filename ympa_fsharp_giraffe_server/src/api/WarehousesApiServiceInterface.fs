namespace ympa_fsharp_giraffe_server
open WarehousesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module WarehousesApiServiceInterface =

    //#region Service interface
    type IWarehousesApiService =
      abstract member GetFulfillmentWarehouses:HttpContext ->GetFulfillmentWarehousesResult
      abstract member GetWarehouses:HttpContext -> GetWarehousesArgs->GetWarehousesResult
    //#endregion