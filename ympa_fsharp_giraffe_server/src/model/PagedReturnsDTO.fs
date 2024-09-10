namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.ReturnDTO

module PagedReturnsDTO =

  //#region PagedReturnsDTO


  type PagedReturnsDTO = {
    Paging : ForwardScrollingPagerDTO;
    Returns : ReturnDTO[];
  }
  //#endregion
