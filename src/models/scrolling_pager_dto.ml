(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Scrolling_pager_dto.t : Информация о страницах результатов.
 *)

type t = {
    (* Идентификатор следующей страницы результатов. *)
    next_page_token: string option [@default None];
    (* Идентификатор предыдущей страницы результатов. *)
    prev_page_token: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о страницах результатов. *)
let create () : t = {
    next_page_token = None;
    prev_page_token = None;
}

