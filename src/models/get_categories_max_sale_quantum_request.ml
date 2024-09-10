(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_categories_max_sale_quantum_request.t : Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 *)

type t = {
    (* Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. *)
    market_category_ids: int64 list;
} [@@deriving yojson { strict = false }, show ];;

(** Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров.  *)
let create (market_category_ids : int64 list) : t = {
    market_category_ids = market_category_ids;
}

