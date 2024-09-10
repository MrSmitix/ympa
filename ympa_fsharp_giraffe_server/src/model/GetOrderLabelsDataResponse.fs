namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrderLabelDTO

module GetOrderLabelsDataResponse =

  //#region GetOrderLabelsDataResponse


  type GetOrderLabelsDataResponse = {
    Status : ApiResponseStatusType;
    Result : OrderLabelDTO;
  }
  //#endregion