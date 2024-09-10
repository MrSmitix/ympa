(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Api_server_error_response.t : Внутренняя ошибка сервера.
 *)

type t = {
    status: Enums.apiresponsestatustype option [@default None];
    (* Список ошибок. *)
    errors: Api_error_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** Внутренняя ошибка сервера. *)
let create () : t = {
    status = None;
    errors = [];
}

