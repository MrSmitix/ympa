namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FullOutletDTO

module GetOutletResponse =

  //#region GetOutletResponse


  type GetOutletResponse = {
    Outlet : FullOutletDTO;
  }
  //#endregion
