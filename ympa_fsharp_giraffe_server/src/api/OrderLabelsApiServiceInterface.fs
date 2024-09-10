namespace ympa_fsharp_giraffe_server
open OrderLabelsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OrderLabelsApiServiceInterface =

    //#region Service interface
    type IOrderLabelsApiService =
      abstract member GenerateOrderLabel:HttpContext -> GenerateOrderLabelArgs->GenerateOrderLabelResult
      abstract member GenerateOrderLabels:HttpContext -> GenerateOrderLabelsArgs->GenerateOrderLabelsResult
      abstract member GetOrderLabelsData:HttpContext -> GetOrderLabelsDataArgs->GetOrderLabelsDataResult
    //#endregion