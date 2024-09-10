namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrderBusinessBuyerDTO

module GetBusinessBuyerInfoResponse =

  //#region GetBusinessBuyerInfoResponse


  type GetBusinessBuyerInfoResponse = {
    Status : ApiResponseStatusType;
    Result : OrderBusinessBuyerDTO;
  }
  //#endregion
