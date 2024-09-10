namespace ympa_fsharp_giraffe_server
open ContentApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ContentApiServiceInterface =

    //#region Service interface
    type IContentApiService =
      abstract member GetCategoryContentParameters:HttpContext -> GetCategoryContentParametersArgs->GetCategoryContentParametersResult
      abstract member GetOfferCardsContentStatus:HttpContext -> GetOfferCardsContentStatusArgs->GetOfferCardsContentStatusResult
      abstract member UpdateOfferContent:HttpContext -> UpdateOfferContentArgs->UpdateOfferContentResult
    //#endregion