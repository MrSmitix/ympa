namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.FulfillmentWarehousesDTO

module GetFulfillmentWarehousesResponse =

  //#region GetFulfillmentWarehousesResponse


  type GetFulfillmentWarehousesResponse = {
    Status : ApiResponseStatusType;
    Result : FulfillmentWarehousesDTO;
  }
  //#endregion
