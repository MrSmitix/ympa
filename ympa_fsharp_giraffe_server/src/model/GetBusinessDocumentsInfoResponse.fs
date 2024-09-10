namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrderBusinessDocumentsDTO

module GetBusinessDocumentsInfoResponse =

  //#region GetBusinessDocumentsInfoResponse


  type GetBusinessDocumentsInfoResponse = {
    Status : ApiResponseStatusType;
    Result : OrderBusinessDocumentsDTO;
  }
  //#endregion
