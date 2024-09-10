namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrdersStatsPaymentOrderDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsPaymentSourceType
open ympa_fsharp_giraffe_server.Model.OrdersStatsPaymentType

module OrdersStatsPaymentDTO =

  //#region OrdersStatsPaymentDTO


  type OrdersStatsPaymentDTO = {
    Id : string;
    Date : DateTime;
    Type : OrdersStatsPaymentType;
    Source : OrdersStatsPaymentSourceType;
    Total : decimal;
    PaymentOrder : OrdersStatsPaymentOrderDTO;
  }
  //#endregion
