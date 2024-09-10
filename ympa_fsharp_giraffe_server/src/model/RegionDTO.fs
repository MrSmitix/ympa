namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.RegionType

module RegionDTO =

  //#region RegionDTO


  type RegionDTO = {
    Id : int64;
    Name : string;
    Type : RegionType;
    Parent : RegionDTO;
    Children : RegionDTO[];
  }
  //#endregion
