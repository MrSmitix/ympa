namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetMappingDTO =

  //#region GetMappingDTO


  type GetMappingDTO = {
    MarketSku : int64;
    MarketSkuName : string;
    MarketModelId : int64;
    MarketModelName : string;
    MarketCategoryId : int64;
    MarketCategoryName : string;
  }
  //#endregion
