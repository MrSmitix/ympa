namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ModelOfferDTO =

  //#region ModelOfferDTO


  type ModelOfferDTO = {
    Discount : int;
    Name : string;
    Pos : int;
    PreDiscountPrice : decimal;
    Price : decimal;
    RegionId : int64;
    ShippingCost : decimal;
    ShopName : string;
    ShopRating : int;
    InStock : int;
  }
  //#endregion
