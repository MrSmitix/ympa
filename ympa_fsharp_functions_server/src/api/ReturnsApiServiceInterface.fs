namespace ympa_fsharp_functions_server
open ReturnsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ReturnsApiServiceInterface =

    //#region Service interface
    type IReturnsApiService =
      abstract member GetReturn : unit -> GetReturnResult
      abstract member GetReturnApplication : unit -> GetReturnApplicationResult
      abstract member GetReturnPhoto : unit -> GetReturnPhotoResult
      abstract member GetReturns : unit -> GetReturnsResult
      abstract member SetReturnDecision : SetReturnDecisionBodyParams -> SetReturnDecisionResult
      abstract member SubmitReturnDecision : unit -> SubmitReturnDecisionResult
    //#endregion