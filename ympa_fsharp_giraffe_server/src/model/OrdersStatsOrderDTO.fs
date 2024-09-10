namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatsStatusType
open ympa_fsharp_giraffe_server.Model.OrdersStatsCommissionDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsDeliveryRegionDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsItemDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsOrderPaymentType
open ympa_fsharp_giraffe_server.Model.OrdersStatsPaymentDTO

module OrdersStatsOrderDTO =

  //#region OrdersStatsOrderDTO


  type OrdersStatsOrderDTO = {
    Id : int64;
    CreationDate : DateTime;
    StatusUpdateDate : Nullable<DateTime>;
    Status : OrderStatsStatusType;
    PartnerOrderId : string;
    PaymentType : OrdersStatsOrderPaymentType;
    Fake : bool;
    DeliveryRegion : OrdersStatsDeliveryRegionDTO;
    Items : OrdersStatsItemDTO[];
    InitialItems : OrdersStatsItemDTO[];
    Payments : OrdersStatsPaymentDTO[];
    Commissions : OrdersStatsCommissionDTO[];
  }
  //#endregion
