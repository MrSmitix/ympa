(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Model_price_dto.t : Информация о ценах на модель товара.
 *)

type t = {
    (* Средняя цена предложения для модели в регионе. *)
    avg: float option [@default None];
    (* Максимальная цена предложения для модели в регионе. *)
    max: float option [@default None];
    (* Минимальная цена предложения для модели в регионе. *)
    min: float option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о ценах на модель товара. *)
let create () : t = {
    avg = None;
    max = None;
    min = None;
}

