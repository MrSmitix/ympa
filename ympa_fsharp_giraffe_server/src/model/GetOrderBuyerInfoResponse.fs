namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrderBuyerInfoDTO

module GetOrderBuyerInfoResponse =

  //#region GetOrderBuyerInfoResponse


  type GetOrderBuyerInfoResponse = {
    Status : ApiResponseStatusType;
    Result : OrderBuyerInfoDTO;
  }
  //#endregion
