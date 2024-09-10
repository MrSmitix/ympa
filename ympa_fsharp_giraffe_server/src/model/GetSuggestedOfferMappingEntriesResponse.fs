namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OfferMappingSuggestionsListDTO

module GetSuggestedOfferMappingEntriesResponse =

  //#region GetSuggestedOfferMappingEntriesResponse


  type GetSuggestedOfferMappingEntriesResponse = {
    Status : ApiResponseStatusType;
    Result : OfferMappingSuggestionsListDTO;
  }
  //#endregion
