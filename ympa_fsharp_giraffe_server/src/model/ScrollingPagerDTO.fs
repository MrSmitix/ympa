namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ScrollingPagerDTO =

  //#region ScrollingPagerDTO


  type ScrollingPagerDTO = {
    NextPageToken : string;
    PrevPageToken : string;
  }
  //#endregion
