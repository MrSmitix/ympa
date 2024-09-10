namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.DeleteOffersDTO

module DeleteOffersResponse =

  //#region DeleteOffersResponse

  [<CLIMutable>]
  type DeleteOffersResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : DeleteOffersDTO;
  }

  //#endregion
