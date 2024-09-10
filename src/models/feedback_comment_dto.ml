(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Feedback_comment_dto.t : Комментарий к отзыву на магазин.
 *)

type t = {
    (* Идентификатор ответа. *)
    id: int64 option [@default None];
    (* Идентификатор родительского ответа. *)
    parent_id: int64 option [@default None];
    (* Текст ответа. *)
    body: string option [@default None];
    (* Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  *)
    created_at: string option [@default None];
    (* Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  *)
    updated_at: string option [@default None];
    author: Feedback_comment_author_dto.t option [@default None];
    (* Дочерние ответы. *)
    children: Feedback_comment_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** Комментарий к отзыву на магазин. *)
let create () : t = {
    id = None;
    parent_id = None;
    body = None;
    created_at = None;
    updated_at = None;
    author = None;
    children = [];
}

