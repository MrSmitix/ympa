namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.GetOfferMappingsResultDTO

module GetOfferMappingsResponse =

  //#region GetOfferMappingsResponse

  [<CLIMutable>]
  type GetOfferMappingsResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : GetOfferMappingsResultDTO;
  }

  //#endregion
