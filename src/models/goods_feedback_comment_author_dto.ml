(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Goods_feedback_comment_author_dto.t : Информация об авторе комментария.
 *)

type t = {
    _type: Enums.goodsfeedbackcommentauthortype option [@default None];
    (* Имя автора или название кабинета. *)
    name: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация об авторе комментария. *)
let create () : t = {
    _type = None;
    name = None;
}

