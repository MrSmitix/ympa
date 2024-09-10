namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModelOfferDTO =

  //#region ModelOfferDTO

  [<CLIMutable>]
  type ModelOfferDTO = {
    [<JsonProperty(PropertyName = "discount")>]
    Discount : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "pos")>]
    Pos : int;
    [<JsonProperty(PropertyName = "preDiscountPrice")>]
    PreDiscountPrice : decimal;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int64;
    [<JsonProperty(PropertyName = "shippingCost")>]
    ShippingCost : decimal;
    [<JsonProperty(PropertyName = "shopName")>]
    ShopName : string;
    [<JsonProperty(PropertyName = "shopRating")>]
    ShopRating : int;
    [<JsonProperty(PropertyName = "inStock")>]
    InStock : int;
  }

  //#endregion
