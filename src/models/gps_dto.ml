(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Gps_dto.t : GPS-координаты широты и долготы. 
 *)

type t = {
    (* Широта. *)
    latitude: float;
    (* Долгота. *)
    longitude: float;
} [@@deriving yojson { strict = false }, show ];;

(** GPS-координаты широты и долготы.  *)
let create (latitude : float) (longitude : float) : t = {
    latitude = latitude;
    longitude = longitude;
}

