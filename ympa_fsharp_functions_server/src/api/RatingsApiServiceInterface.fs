namespace ympa_fsharp_functions_server
open RatingsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module RatingsApiServiceInterface =

    //#region Service interface
    type IRatingsApiService =
      abstract member GetQualityRatingDetails : unit -> GetQualityRatingDetailsResult
      abstract member GetQualityRatings : GetQualityRatingsBodyParams -> GetQualityRatingsResult
    //#endregion