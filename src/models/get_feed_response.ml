(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_feed_response.t : Ответ на запрос информации о прайс-листе.
 *)

type t = {
    feed: Feed_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Ответ на запрос информации о прайс-листе. *)
let create () : t = {
    feed = None;
}

