namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersDTO

module DeleteCampaignOffersResponse =

  //#region DeleteCampaignOffersResponse


  type DeleteCampaignOffersResponse = {
    Status : ApiResponseStatusType;
    Result : DeleteCampaignOffersDTO;
  }
  //#endregion
