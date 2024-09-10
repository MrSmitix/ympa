namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.OrderBoxesLayoutDTO

module SetOrderBoxLayoutResponse =

  //#region SetOrderBoxLayoutResponse

  [<CLIMutable>]
  type SetOrderBoxLayoutResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : OrderBoxesLayoutDTO;
  }

  //#endregion
