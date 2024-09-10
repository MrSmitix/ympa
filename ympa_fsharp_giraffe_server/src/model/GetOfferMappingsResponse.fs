namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsResultDTO

module GetOfferMappingsResponse =

  //#region GetOfferMappingsResponse


  type GetOfferMappingsResponse = {
    Status : ApiResponseStatusType;
    Result : GetOfferMappingsResultDTO;
  }
  //#endregion
