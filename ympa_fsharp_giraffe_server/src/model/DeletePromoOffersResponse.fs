namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersResultDTO

module DeletePromoOffersResponse =

  //#region DeletePromoOffersResponse


  type DeletePromoOffersResponse = {
    Status : ApiResponseStatusType;
    Result : DeletePromoOffersResultDTO;
  }
  //#endregion
