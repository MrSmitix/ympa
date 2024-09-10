namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.UpdateOfferMappingResultDTO

module UpdateOfferMappingsResponse =

  //#region UpdateOfferMappingsResponse

  [<CLIMutable>]
  type UpdateOfferMappingsResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "results")>]
    Results : UpdateOfferMappingResultDTO[];
  }

  //#endregion
