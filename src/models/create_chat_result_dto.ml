(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Create_chat_result_dto.t : Информация о созданном чате.
 *)

type t = {
    (* Идентификатор чата. *)
    chat_id: int64;
} [@@deriving yojson { strict = false }, show ];;

(** Информация о созданном чате. *)
let create (chat_id : int64) : t = {
    chat_id = chat_id;
}

