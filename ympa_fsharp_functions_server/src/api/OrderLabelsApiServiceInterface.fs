namespace ympa_fsharp_functions_server
open OrderLabelsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OrderLabelsApiServiceInterface =

    //#region Service interface
    type IOrderLabelsApiService =
      abstract member GenerateOrderLabel : unit -> GenerateOrderLabelResult
      abstract member GenerateOrderLabels : unit -> GenerateOrderLabelsResult
      abstract member GetOrderLabelsData : unit -> GetOrderLabelsDataResult
    //#endregion