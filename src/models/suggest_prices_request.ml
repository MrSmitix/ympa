(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Suggest_prices_request.t : Запрос на получение списка цен для продвижения.
 *)

type t = {
    (* Список товаров. *)
    offers: Suggest_offer_price_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** Запрос на получение списка цен для продвижения. *)
let create (offers : Suggest_offer_price_dto.t list) : t = {
    offers = offers;
}

