namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.OrderBuyerDTO
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDTO
open ympa_fsharp_giraffe_server.Model.OrderItemDTO
open ympa_fsharp_giraffe_server.Model.OrderPaymentMethodType
open ympa_fsharp_giraffe_server.Model.OrderPaymentType
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubsidyDTO
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType
open ympa_fsharp_giraffe_server.Model.OrderTaxSystemType

module OrderDTO =

  //#region OrderDTO


  type OrderDTO = {
    Id : int64;
    Status : OrderStatusType;
    Substatus : OrderSubstatusType;
    CreationDate : string;
    UpdatedAt : string;
    Currency : CurrencyType;
    ItemsTotal : decimal;
    DeliveryTotal : decimal;
    BuyerItemsTotal : decimal;
    BuyerTotal : decimal;
    BuyerItemsTotalBeforeDiscount : decimal;
    BuyerTotalBeforeDiscount : decimal;
    PaymentType : OrderPaymentType;
    PaymentMethod : OrderPaymentMethodType;
    Fake : bool;
    Items : OrderItemDTO[];
    Subsidies : OrderSubsidyDTO[];
    Delivery : OrderDeliveryDTO;
    Buyer : OrderBuyerDTO;
    Notes : string;
    TaxSystem : OrderTaxSystemType;
    CancelRequested : bool;
    ExpiryDate : string;
  }
  //#endregion
