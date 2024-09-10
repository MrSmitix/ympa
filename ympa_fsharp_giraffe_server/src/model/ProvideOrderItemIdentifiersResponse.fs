namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrderItemsModificationResultDTO

module ProvideOrderItemIdentifiersResponse =

  //#region ProvideOrderItemIdentifiersResponse


  type ProvideOrderItemIdentifiersResponse = {
    Status : ApiResponseStatusType;
    Result : OrderItemsModificationResultDTO;
  }
  //#endregion
