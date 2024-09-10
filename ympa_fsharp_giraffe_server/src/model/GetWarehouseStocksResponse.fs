namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksDTO

module GetWarehouseStocksResponse =

  //#region GetWarehouseStocksResponse


  type GetWarehouseStocksResponse = {
    Status : ApiResponseStatusType;
    Result : GetWarehouseStocksDTO;
  }
  //#endregion
