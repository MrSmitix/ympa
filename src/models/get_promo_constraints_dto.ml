(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_promo_constraints_dto.t : Ограничения в акции.
 *)

type t = {
    (* Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  *)
    warehouse_ids: int64 list;
} [@@deriving yojson { strict = false }, show ];;

(** Ограничения в акции. *)
let create () : t = {
    warehouse_ids = [];
}

