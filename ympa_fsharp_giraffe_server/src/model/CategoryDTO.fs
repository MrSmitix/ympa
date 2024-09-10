namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module CategoryDTO =

  //#region CategoryDTO


  type CategoryDTO = {
    Id : int64;
    Name : string;
    Children : CategoryDTO[];
  }
  //#endregion
