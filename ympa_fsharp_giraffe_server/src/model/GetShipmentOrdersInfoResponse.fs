namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrdersShipmentInfoDTO

module GetShipmentOrdersInfoResponse =

  //#region GetShipmentOrdersInfoResponse


  type GetShipmentOrdersInfoResponse = {
    Status : ApiResponseStatusType;
    Result : OrdersShipmentInfoDTO;
  }
  //#endregion
