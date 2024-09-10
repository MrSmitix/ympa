namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderItemDetailDTO
open ympa_fsharp_functions_server.Model.OrderItemInstanceDTO
open ympa_fsharp_functions_server.Model.OrderItemInstanceType
open ympa_fsharp_functions_server.Model.OrderItemPromoDTO
open ympa_fsharp_functions_server.Model.OrderItemSubsidyDTO
open ympa_fsharp_functions_server.Model.OrderVatType

module OrderItemDTO =

  //#region OrderItemDTO

  [<CLIMutable>]
  type OrderItemDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "offerName")>]
    OfferName : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "buyerPrice")>]
    BuyerPrice : decimal;
    [<JsonProperty(PropertyName = "buyerPriceBeforeDiscount")>]
    BuyerPriceBeforeDiscount : decimal;
    [<JsonProperty(PropertyName = "priceBeforeDiscount")>]
    PriceBeforeDiscount : decimal;
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "vat")>]
    Vat : OrderVatType;
    [<JsonProperty(PropertyName = "shopSku")>]
    ShopSku : string;
    [<JsonProperty(PropertyName = "subsidy")>]
    Subsidy : decimal;
    [<JsonProperty(PropertyName = "partnerWarehouseId")>]
    PartnerWarehouseId : string;
    [<JsonProperty(PropertyName = "promos")>]
    Promos : OrderItemPromoDTO[];
    [<JsonProperty(PropertyName = "instances")>]
    Instances : OrderItemInstanceDTO[];
    [<JsonProperty(PropertyName = "details")>]
    Details : OrderItemDetailDTO[];
    [<JsonProperty(PropertyName = "subsidies")>]
    Subsidies : OrderItemSubsidyDTO[];
    [<JsonProperty(PropertyName = "requiredInstanceTypes")>]
    RequiredInstanceTypes : OrderItemInstanceType[];
  }

  //#endregion
