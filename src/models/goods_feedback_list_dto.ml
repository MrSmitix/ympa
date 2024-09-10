(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Goods_feedback_list_dto.t : Список отзывов о товарах. 
 *)

type t = {
    (* Список отзывов. *)
    feedbacks: Goods_feedback_dto.t list;
    paging: Forward_scrolling_pager_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Список отзывов о товарах.  *)
let create (feedbacks : Goods_feedback_dto.t list) : t = {
    feedbacks = feedbacks;
    paging = None;
}

