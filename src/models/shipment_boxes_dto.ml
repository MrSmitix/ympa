(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Shipment_boxes_dto.t : В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 *)

type t = {
    (* Список грузовых мест. Маркет определил количество мест по длине этого списка.  *)
    boxes: Parcel_box_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания.  *)
let create (boxes : Parcel_box_dto.t list) : t = {
    boxes = boxes;
}

