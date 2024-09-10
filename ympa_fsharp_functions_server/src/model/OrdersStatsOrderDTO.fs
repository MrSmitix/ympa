namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatsStatusType
open ympa_fsharp_functions_server.Model.OrdersStatsCommissionDTO
open ympa_fsharp_functions_server.Model.OrdersStatsDeliveryRegionDTO
open ympa_fsharp_functions_server.Model.OrdersStatsItemDTO
open ympa_fsharp_functions_server.Model.OrdersStatsOrderPaymentType
open ympa_fsharp_functions_server.Model.OrdersStatsPaymentDTO

module OrdersStatsOrderDTO =

  //#region OrdersStatsOrderDTO

  [<CLIMutable>]
  type OrdersStatsOrderDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "creationDate")>]
    CreationDate : DateTime;
    [<JsonProperty(PropertyName = "statusUpdateDate")>]
    StatusUpdateDate : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderStatsStatusType;
    [<JsonProperty(PropertyName = "partnerOrderId")>]
    PartnerOrderId : string;
    [<JsonProperty(PropertyName = "paymentType")>]
    PaymentType : OrdersStatsOrderPaymentType;
    [<JsonProperty(PropertyName = "fake")>]
    Fake : bool;
    [<JsonProperty(PropertyName = "deliveryRegion")>]
    DeliveryRegion : OrdersStatsDeliveryRegionDTO;
    [<JsonProperty(PropertyName = "items")>]
    Items : OrdersStatsItemDTO[];
    [<JsonProperty(PropertyName = "initialItems")>]
    InitialItems : OrdersStatsItemDTO[];
    [<JsonProperty(PropertyName = "payments")>]
    Payments : OrdersStatsPaymentDTO[];
    [<JsonProperty(PropertyName = "commissions")>]
    Commissions : OrdersStatsCommissionDTO[];
  }

  //#endregion
