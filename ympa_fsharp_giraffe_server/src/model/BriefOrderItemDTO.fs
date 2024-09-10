namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderItemInstanceDTO
open ympa_fsharp_giraffe_server.Model.OrderVatType

module BriefOrderItemDTO =

  //#region BriefOrderItemDTO


  type BriefOrderItemDTO = {
    Id : int64;
    Vat : OrderVatType;
    Count : int;
    Price : decimal;
    OfferName : string;
    OfferId : string;
    Instances : OrderItemInstanceDTO[];
  }
  //#endregion
