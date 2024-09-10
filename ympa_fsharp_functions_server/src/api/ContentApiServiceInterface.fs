namespace ympa_fsharp_functions_server
open ContentApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ContentApiServiceInterface =

    //#region Service interface
    type IContentApiService =
      abstract member GetCategoryContentParameters : unit -> GetCategoryContentParametersResult
      abstract member GetOfferCardsContentStatus : GetOfferCardsContentStatusBodyParams -> GetOfferCardsContentStatusResult
      abstract member UpdateOfferContent : UpdateOfferContentBodyParams -> UpdateOfferContentResult
    //#endregion