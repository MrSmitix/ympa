namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingResultDTO

module UpdateOfferMappingsResponse =

  //#region UpdateOfferMappingsResponse


  type UpdateOfferMappingsResponse = {
    Status : ApiResponseStatusType;
    Results : UpdateOfferMappingResultDTO[];
  }
  //#endregion
