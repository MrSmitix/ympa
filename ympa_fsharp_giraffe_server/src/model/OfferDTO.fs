namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType

module OfferDTO =

  //#region OfferDTO


  type OfferDTO = {
    Price : decimal;
    FeedId : int64;
    Id : string;
    ShopCategoryId : string;
    MarketCategoryId : int;
    PreDiscountPrice : decimal;
    Discount : int;
    CutPrice : bool;
    Url : string;
    ModelId : int64;
    Name : string;
    Currency : CurrencyType;
    Bid : decimal;
    Cbid : decimal;
    Fee : decimal;
    Blocked : bool;
  }
  //#endregion
