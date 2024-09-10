namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FlippingPagerDTO
open ympa_fsharp_giraffe_server.Model.RegionDTO

module GetRegionWithChildrenResponse =

  //#region GetRegionWithChildrenResponse


  type GetRegionWithChildrenResponse = {
    Pager : FlippingPagerDTO;
    Regions : RegionDTO;
  }
  //#endregion
