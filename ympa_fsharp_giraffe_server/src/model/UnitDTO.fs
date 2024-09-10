namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module UnitDTO =

  //#region UnitDTO


  type UnitDTO = {
    Id : int64;
    Name : string;
    FullName : string;
  }
  //#endregion
