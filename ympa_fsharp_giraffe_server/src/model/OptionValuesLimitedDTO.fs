namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OptionValuesLimitedDTO =

  //#region OptionValuesLimitedDTO


  type OptionValuesLimitedDTO = {
    LimitingOptionValueId : int64;
    OptionValueIds : int64[];
  }
  //#endregion
