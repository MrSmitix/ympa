namespace ympa_fsharp_functions_server
open BidsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BidsApiServiceInterface =

    //#region Service interface
    type IBidsApiService =
      abstract member GetBidsInfoForBusiness : GetBidsInfoForBusinessBodyParams -> GetBidsInfoForBusinessResult
      abstract member GetBidsRecommendations : GetBidsRecommendationsBodyParams -> GetBidsRecommendationsResult
      abstract member PutBidsForBusiness : PutBidsForBusinessBodyParams -> PutBidsForBusinessResult
      abstract member PutBidsForCampaign : PutBidsForCampaignBodyParams -> PutBidsForCampaignResult
    //#endregion