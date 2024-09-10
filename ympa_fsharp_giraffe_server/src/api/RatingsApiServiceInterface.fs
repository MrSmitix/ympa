namespace ympa_fsharp_giraffe_server
open RatingsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module RatingsApiServiceInterface =

    //#region Service interface
    type IRatingsApiService =
      abstract member GetQualityRatingDetails:HttpContext -> GetQualityRatingDetailsArgs->GetQualityRatingDetailsResult
      abstract member GetQualityRatings:HttpContext -> GetQualityRatingsArgs->GetQualityRatingsResult
    //#endregion