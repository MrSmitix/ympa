namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FlippingPagerDTO
open ympa_fsharp_giraffe_server.Model.FullOutletDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module GetOutletsResponse =

  //#region GetOutletsResponse


  type GetOutletsResponse = {
    Outlets : FullOutletDTO[];
    Paging : ScrollingPagerDTO;
    Pager : FlippingPagerDTO;
  }
  //#endregion
