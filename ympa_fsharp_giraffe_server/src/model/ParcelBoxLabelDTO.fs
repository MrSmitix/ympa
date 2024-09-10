namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ParcelBoxLabelDTO =

  //#region ParcelBoxLabelDTO


  type ParcelBoxLabelDTO = {
    Url : string;
    SupplierName : string;
    DeliveryServiceName : string;
    OrderId : int64;
    OrderNum : string;
    RecipientName : string;
    BoxId : int64;
    FulfilmentId : string;
    Place : string;
    Weight : string;
    DeliveryServiceId : string;
    DeliveryAddress : string;
    ShipmentDate : string;
  }
  //#endregion
