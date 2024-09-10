namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.MechanicsType
open ympa_fsharp_giraffe_server.Model.PromoParticipationType

module GetPromosRequest =

  //#region GetPromosRequest


  type GetPromosRequest = {
    Participation : PromoParticipationType;
    Mechanics : MechanicsType;
  }
  //#endregion
