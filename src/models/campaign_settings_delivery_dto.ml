(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Campaign_settings_delivery_dto.t : Информация о доставке в своем регионе магазина.
 *)

type t = {
    schedule: Campaign_settings_schedule_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о доставке в своем регионе магазина. *)
let create () : t = {
    schedule = None;
}

