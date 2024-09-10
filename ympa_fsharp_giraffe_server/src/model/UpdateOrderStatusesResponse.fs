namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesDTO

module UpdateOrderStatusesResponse =

  //#region UpdateOrderStatusesResponse


  type UpdateOrderStatusesResponse = {
    Status : ApiResponseStatusType;
    Result : UpdateOrderStatusesDTO;
  }
  //#endregion
