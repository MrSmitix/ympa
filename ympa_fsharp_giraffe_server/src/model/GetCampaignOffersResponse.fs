namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersResultDTO

module GetCampaignOffersResponse =

  //#region GetCampaignOffersResponse


  type GetCampaignOffersResponse = {
    Status : ApiResponseStatusType;
    Result : GetCampaignOffersResultDTO;
  }
  //#endregion
