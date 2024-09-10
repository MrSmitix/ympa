(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Delivery_service_info_dto.t : Информация о службе доставки.
 *)

type t = {
    (* Идентификатор службы доставки. *)
    id: int64;
    (* Наименование службы доставки. *)
    name: string;
} [@@deriving yojson { strict = false }, show ];;

(** Информация о службе доставки. *)
let create (id : int64) (name : string) : t = {
    id = id;
    name = name;
}

