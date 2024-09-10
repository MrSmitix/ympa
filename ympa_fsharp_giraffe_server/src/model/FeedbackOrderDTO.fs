namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackDeliveryType

module FeedbackOrderDTO =

  //#region FeedbackOrderDTO


  type FeedbackOrderDTO = {
    ShopOrderId : string;
    Delivery : FeedbackDeliveryType;
  }
  //#endregion
