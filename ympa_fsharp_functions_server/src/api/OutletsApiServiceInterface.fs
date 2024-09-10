namespace ympa_fsharp_functions_server
open OutletsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OutletsApiServiceInterface =

    //#region Service interface
    type IOutletsApiService =
      abstract member CreateOutlet : CreateOutletBodyParams -> CreateOutletResult
      abstract member DeleteOutlet : unit -> DeleteOutletResult
      abstract member GetOutlet : unit -> GetOutletResult
      abstract member GetOutlets : unit -> GetOutletsResult
      abstract member UpdateOutlet : UpdateOutletBodyParams -> UpdateOutletResult
    //#endregion