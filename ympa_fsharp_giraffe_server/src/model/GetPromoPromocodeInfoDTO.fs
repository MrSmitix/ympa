namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetPromoPromocodeInfoDTO =

  //#region GetPromoPromocodeInfoDTO


  type GetPromoPromocodeInfoDTO = {
    Promocode : string;
    Discount : int;
  }
  //#endregion
