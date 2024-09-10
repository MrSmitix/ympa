namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.OrderBuyerInfoDTO

module GetOrderBuyerInfoResponse =

  //#region GetOrderBuyerInfoResponse

  [<CLIMutable>]
  type GetOrderBuyerInfoResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : OrderBuyerInfoDTO;
  }

  //#endregion
