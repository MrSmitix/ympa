(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Update_offer_mapping_entry_request.t : Запрос на обновление товаров.
 *)

type t = {
    (* Информация о товарах в каталоге. *)
    offer_mapping_entries: Update_offer_mapping_entry_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** Запрос на обновление товаров. *)
let create (offer_mapping_entries : Update_offer_mapping_entry_dto.t list) : t = {
    offer_mapping_entries = offer_mapping_entries;
}

