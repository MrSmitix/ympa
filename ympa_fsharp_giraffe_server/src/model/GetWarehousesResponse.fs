namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.WarehousesDTO

module GetWarehousesResponse =

  //#region GetWarehousesResponse


  type GetWarehousesResponse = {
    Status : ApiResponseStatusType;
    Result : WarehousesDTO;
  }
  //#endregion
