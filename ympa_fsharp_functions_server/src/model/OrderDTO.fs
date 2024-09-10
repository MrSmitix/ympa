namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType
open ympa_fsharp_functions_server.Model.OrderBuyerDTO
open ympa_fsharp_functions_server.Model.OrderDeliveryDTO
open ympa_fsharp_functions_server.Model.OrderItemDTO
open ympa_fsharp_functions_server.Model.OrderPaymentMethodType
open ympa_fsharp_functions_server.Model.OrderPaymentType
open ympa_fsharp_functions_server.Model.OrderStatusType
open ympa_fsharp_functions_server.Model.OrderSubsidyDTO
open ympa_fsharp_functions_server.Model.OrderSubstatusType
open ympa_fsharp_functions_server.Model.OrderTaxSystemType

module OrderDTO =

  //#region OrderDTO

  [<CLIMutable>]
  type OrderDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderStatusType;
    [<JsonProperty(PropertyName = "substatus")>]
    Substatus : OrderSubstatusType;
    [<JsonProperty(PropertyName = "creationDate")>]
    CreationDate : string;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : string;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
    [<JsonProperty(PropertyName = "itemsTotal")>]
    ItemsTotal : decimal;
    [<JsonProperty(PropertyName = "deliveryTotal")>]
    DeliveryTotal : decimal;
    [<JsonProperty(PropertyName = "buyerItemsTotal")>]
    BuyerItemsTotal : decimal;
    [<JsonProperty(PropertyName = "buyerTotal")>]
    BuyerTotal : decimal;
    [<JsonProperty(PropertyName = "buyerItemsTotalBeforeDiscount")>]
    BuyerItemsTotalBeforeDiscount : decimal;
    [<JsonProperty(PropertyName = "buyerTotalBeforeDiscount")>]
    BuyerTotalBeforeDiscount : decimal;
    [<JsonProperty(PropertyName = "paymentType")>]
    PaymentType : OrderPaymentType;
    [<JsonProperty(PropertyName = "paymentMethod")>]
    PaymentMethod : OrderPaymentMethodType;
    [<JsonProperty(PropertyName = "fake")>]
    Fake : bool;
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderItemDTO[];
    [<JsonProperty(PropertyName = "subsidies")>]
    Subsidies : OrderSubsidyDTO[];
    [<JsonProperty(PropertyName = "delivery")>]
    Delivery : OrderDeliveryDTO;
    [<JsonProperty(PropertyName = "buyer")>]
    Buyer : OrderBuyerDTO;
    [<JsonProperty(PropertyName = "notes")>]
    Notes : string;
    [<JsonProperty(PropertyName = "taxSystem")>]
    TaxSystem : OrderTaxSystemType;
    [<JsonProperty(PropertyName = "cancelRequested")>]
    CancelRequested : bool;
    [<JsonProperty(PropertyName = "expiryDate")>]
    ExpiryDate : string;
  }

  //#endregion
