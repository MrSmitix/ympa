namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetPromoOffersResultDTO

module GetPromoOffersResponse =

  //#region GetPromoOffersResponse


  type GetPromoOffersResponse = {
    Status : ApiResponseStatusType;
    Result : GetPromoOffersResultDTO;
  }
  //#endregion
