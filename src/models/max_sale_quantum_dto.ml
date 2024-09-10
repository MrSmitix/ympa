(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Max_sale_quantum_dto.t : Лимит на установку кванта и минимального количества товаров по категориям. 
 *)

type t = {
    (* Идентификатор категории. *)
    id: int64;
    (* Название категории. *)
    name: string option [@default None];
    (* Лимит на установку кванта и минимального количества товаров. *)
    max_sale_quantum: int32 option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Лимит на установку кванта и минимального количества товаров по категориям.  *)
let create (id : int64) : t = {
    id = id;
    name = None;
    max_sale_quantum = None;
}

