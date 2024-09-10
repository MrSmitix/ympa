namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OfferCardsContentStatusDTO

module GetOfferCardsContentStatusResponse =

  //#region GetOfferCardsContentStatusResponse


  type GetOfferCardsContentStatusResponse = {
    Status : ApiResponseStatusType;
    Result : OfferCardsContentStatusDTO;
  }
  //#endregion
