namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OfferMappingEntriesDTO

module GetOfferMappingEntriesResponse =

  //#region GetOfferMappingEntriesResponse


  type GetOfferMappingEntriesResponse = {
    Status : ApiResponseStatusType;
    Result : OfferMappingEntriesDTO;
  }
  //#endregion
