namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderPromoType

module OrderItemPromoDTO =

  //#region OrderItemPromoDTO


  type OrderItemPromoDTO = {
    Type : OrderPromoType;
    Discount : decimal;
    Subsidy : decimal;
    ShopPromoId : string;
    MarketPromoId : string;
  }
  //#endregion
