namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderDigitalItemDTO

module ProvideOrderDigitalCodesRequest =

  //#region ProvideOrderDigitalCodesRequest


  type ProvideOrderDigitalCodesRequest = {
    Items : OrderDigitalItemDTO[];
  }
  //#endregion
