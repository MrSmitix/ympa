namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentResultDTO

module UpdateOfferContentResponse =

  //#region UpdateOfferContentResponse


  type UpdateOfferContentResponse = {
    Status : ApiResponseStatusType;
    Results : UpdateOfferContentResultDTO[];
  }
  //#endregion
