(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Search_shipments_response.t : Ответ на запрос информации об отгрузках.
 *)

type t = {
    status: Enums.apiresponsestatustype option [@default None];
    _result: Search_shipments_response_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Ответ на запрос информации об отгрузках. *)
let create () : t = {
    status = None;
    _result = None;
}

