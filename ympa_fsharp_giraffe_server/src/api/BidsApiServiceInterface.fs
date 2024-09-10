namespace ympa_fsharp_giraffe_server
open BidsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BidsApiServiceInterface =

    //#region Service interface
    type IBidsApiService =
      abstract member GetBidsInfoForBusiness:HttpContext -> GetBidsInfoForBusinessArgs->GetBidsInfoForBusinessResult
      abstract member GetBidsRecommendations:HttpContext -> GetBidsRecommendationsArgs->GetBidsRecommendationsResult
      abstract member PutBidsForBusiness:HttpContext -> PutBidsForBusinessArgs->PutBidsForBusinessResult
      abstract member PutBidsForCampaign:HttpContext -> PutBidsForCampaignArgs->PutBidsForCampaignResult
    //#endregion