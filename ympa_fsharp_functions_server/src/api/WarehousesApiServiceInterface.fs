namespace ympa_fsharp_functions_server
open WarehousesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module WarehousesApiServiceInterface =

    //#region Service interface
    type IWarehousesApiService =
      abstract member GetFulfillmentWarehouses : unit -> GetFulfillmentWarehousesResult
      abstract member GetWarehouses : unit -> GetWarehousesResult
    //#endregion