namespace ympa_fsharp_functions_server
open StocksApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module StocksApiServiceInterface =

    //#region Service interface
    type IStocksApiService =
      abstract member GetStocks : GetStocksBodyParams -> GetStocksResult
      abstract member UpdateStocks : UpdateStocksBodyParams -> UpdateStocksResult
    //#endregion