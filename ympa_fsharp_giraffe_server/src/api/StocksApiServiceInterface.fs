namespace ympa_fsharp_giraffe_server
open StocksApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module StocksApiServiceInterface =

    //#region Service interface
    type IStocksApiService =
      abstract member GetStocks:HttpContext -> GetStocksArgs->GetStocksResult
      abstract member UpdateStocks:HttpContext -> UpdateStocksArgs->UpdateStocksResult
    //#endregion