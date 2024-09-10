namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.AddOffersToArchiveDTO
open ympa_fsharp_functions_server.Model.ApiResponseStatusType

module AddOffersToArchiveResponse =

  //#region AddOffersToArchiveResponse

  [<CLIMutable>]
  type AddOffersToArchiveResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : AddOffersToArchiveDTO;
  }

  //#endregion
