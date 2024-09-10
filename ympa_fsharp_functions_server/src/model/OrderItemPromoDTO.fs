namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderPromoType

module OrderItemPromoDTO =

  //#region OrderItemPromoDTO

  [<CLIMutable>]
  type OrderItemPromoDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OrderPromoType;
    [<JsonProperty(PropertyName = "discount")>]
    Discount : decimal;
    [<JsonProperty(PropertyName = "subsidy")>]
    Subsidy : decimal;
    [<JsonProperty(PropertyName = "shopPromoId")>]
    ShopPromoId : string;
    [<JsonProperty(PropertyName = "marketPromoId")>]
    MarketPromoId : string;
  }

  //#endregion
