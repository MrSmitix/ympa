namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType

module OfferDTO =

  //#region OfferDTO

  [<CLIMutable>]
  type OfferDTO = {
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "feedId")>]
    FeedId : int64;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "shopCategoryId")>]
    ShopCategoryId : string;
    [<JsonProperty(PropertyName = "marketCategoryId")>]
    MarketCategoryId : int;
    [<JsonProperty(PropertyName = "preDiscountPrice")>]
    PreDiscountPrice : decimal;
    [<JsonProperty(PropertyName = "discount")>]
    Discount : int;
    [<JsonProperty(PropertyName = "cutPrice")>]
    CutPrice : bool;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "modelId")>]
    ModelId : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
    [<JsonProperty(PropertyName = "bid")>]
    Bid : decimal;
    [<JsonProperty(PropertyName = "cbid")>]
    Cbid : decimal;
    [<JsonProperty(PropertyName = "fee")>]
    Fee : decimal;
    [<JsonProperty(PropertyName = "blocked")>]
    Blocked : bool;
  }

  //#endregion
