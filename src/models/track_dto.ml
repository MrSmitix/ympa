(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Track_dto.t : Информация о трек-номерах.
 *)

type t = {
    (* Трек-код почтового отправления. *)
    track_code: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о трек-номерах. *)
let create () : t = {
    track_code = None;
}

