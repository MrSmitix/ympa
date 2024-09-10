namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module FlippingPagerDTO =

  //#region FlippingPagerDTO


  type FlippingPagerDTO = {
    Total : int;
    From : int;
    To : int;
    CurrentPage : int;
    PagesCount : int;
    PageSize : int;
  }
  //#endregion
