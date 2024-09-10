namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderItemDetailDTO
open ympa_fsharp_giraffe_server.Model.OrderItemInstanceDTO
open ympa_fsharp_giraffe_server.Model.OrderItemInstanceType
open ympa_fsharp_giraffe_server.Model.OrderItemPromoDTO
open ympa_fsharp_giraffe_server.Model.OrderItemSubsidyDTO
open ympa_fsharp_giraffe_server.Model.OrderVatType

module OrderItemDTO =

  //#region OrderItemDTO


  type OrderItemDTO = {
    Id : int64;
    OfferId : string;
    OfferName : string;
    Price : decimal;
    BuyerPrice : decimal;
    BuyerPriceBeforeDiscount : decimal;
    PriceBeforeDiscount : decimal;
    Count : int;
    Vat : OrderVatType;
    ShopSku : string;
    Subsidy : decimal;
    PartnerWarehouseId : string;
    Promos : OrderItemPromoDTO[];
    Instances : OrderItemInstanceDTO[];
    Details : OrderItemDetailDTO[];
    Subsidies : OrderItemSubsidyDTO[];
    RequiredInstanceTypes : OrderItemInstanceType[];
  }
  //#endregion
