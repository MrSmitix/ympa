namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module MaxSaleQuantumDTO =

  //#region MaxSaleQuantumDTO


  type MaxSaleQuantumDTO = {
    Id : int64;
    Name : string;
    MaxSaleQuantum : int;
  }
  //#endregion
