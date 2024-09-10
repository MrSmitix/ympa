namespace ympa_fsharp_giraffe_server
open OutletsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OutletsApiServiceInterface =

    //#region Service interface
    type IOutletsApiService =
      abstract member CreateOutlet:HttpContext -> CreateOutletArgs->CreateOutletResult
      abstract member DeleteOutlet:HttpContext -> DeleteOutletArgs->DeleteOutletResult
      abstract member GetOutlet:HttpContext -> GetOutletArgs->GetOutletResult
      abstract member GetOutlets:HttpContext -> GetOutletsArgs->GetOutletsResult
      abstract member UpdateOutlet:HttpContext -> UpdateOutletArgs->UpdateOutletResult
    //#endregion