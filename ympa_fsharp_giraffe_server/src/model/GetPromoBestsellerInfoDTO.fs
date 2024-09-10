namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetPromoBestsellerInfoDTO =

  //#region GetPromoBestsellerInfoDTO


  type GetPromoBestsellerInfoDTO = {
    Bestseller : bool;
    EntryDeadline : Nullable<DateTime>;
  }
  //#endregion
