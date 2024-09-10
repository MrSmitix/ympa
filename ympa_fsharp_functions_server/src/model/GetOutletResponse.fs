namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FullOutletDTO

module GetOutletResponse =

  //#region GetOutletResponse

  [<CLIMutable>]
  type GetOutletResponse = {
    [<JsonProperty(PropertyName = "outlet")>]
    Outlet : FullOutletDTO;
  }

  //#endregion
