namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderItemInstanceModificationDTO

module ProvideOrderItemIdentifiersRequest =

  //#region ProvideOrderItemIdentifiersRequest


  type ProvideOrderItemIdentifiersRequest = {
    Items : OrderItemInstanceModificationDTO[];
  }
  //#endregion
