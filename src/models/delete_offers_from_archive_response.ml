(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Delete_offers_from_archive_response.t : Результат разархивации товаров.
 *)

type t = {
    status: Enums.apiresponsestatustype option [@default None];
    _result: Delete_offers_from_archive_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Результат разархивации товаров. *)
let create () : t = {
    status = None;
    _result = None;
}

