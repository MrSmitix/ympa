(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    (* Список товаров. *)
    offers: Suggested_offer_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    offers = [];
}

