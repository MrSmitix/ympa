(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Offer_processing_note_dto.t : Причины, по которым товар не прошел модерацию.
 *)

type t = {
    _type: Enums.offerprocessingnotetype option [@default None];
    (* Дополнительная информация о причине отклонения товара.  *)
    payload: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Причины, по которым товар не прошел модерацию. *)
let create () : t = {
    _type = None;
    payload = None;
}

