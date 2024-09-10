namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersResultDTO

module UpdatePromoOffersResponse =

  //#region UpdatePromoOffersResponse


  type UpdatePromoOffersResponse = {
    Status : ApiResponseStatusType;
    Result : UpdatePromoOffersResultDTO;
  }
  //#endregion
