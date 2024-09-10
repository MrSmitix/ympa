namespace ympa_fsharp_giraffe_server
open ReturnsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ReturnsApiServiceInterface =

    //#region Service interface
    type IReturnsApiService =
      abstract member GetReturn:HttpContext -> GetReturnArgs->GetReturnResult
      abstract member GetReturnApplication:HttpContext -> GetReturnApplicationArgs->GetReturnApplicationResult
      abstract member GetReturnPhoto:HttpContext -> GetReturnPhotoArgs->GetReturnPhotoResult
      abstract member GetReturns:HttpContext -> GetReturnsArgs->GetReturnsResult
      abstract member SetReturnDecision:HttpContext -> SetReturnDecisionArgs->SetReturnDecisionResult
      abstract member SubmitReturnDecision:HttpContext -> SubmitReturnDecisionArgs->SubmitReturnDecisionResult
    //#endregion