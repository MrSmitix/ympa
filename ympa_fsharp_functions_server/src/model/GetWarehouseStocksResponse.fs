namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.GetWarehouseStocksDTO

module GetWarehouseStocksResponse =

  //#region GetWarehouseStocksResponse

  [<CLIMutable>]
  type GetWarehouseStocksResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : GetWarehouseStocksDTO;
  }

  //#endregion
