namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RegionType =

  //#region RegionType

  let OTHEREnum = "OTHER"
  let CONTINENTEnum = "CONTINENT"
  let REGIONEnum = "REGION"
  let COUNTRYEnum = "COUNTRY"
  let COUNTRYDISTRICTEnum = "COUNTRY_DISTRICT"
  let REPUBLICEnum = "REPUBLIC"
  let CITYEnum = "CITY"
  let VILLAGEEnum = "VILLAGE"
  let CITYDISTRICTEnum = "CITY_DISTRICT"
  let SUBWAYSTATIONEnum = "SUBWAY_STATION"
  let REPUBLICAREAEnum = "REPUBLIC_AREA"
  type RegionType = string

  //#endregion
