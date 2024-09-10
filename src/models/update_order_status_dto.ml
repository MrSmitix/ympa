(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Update_order_status_dto.t : Список заказов.
 *)

type t = {
    (* Идентификатор заказа. *)
    id: int64 option [@default None];
    status: Enums.orderstatustype option [@default None];
    substatus: Enums.ordersubstatustype option [@default None];
    update_status: Enums.apiresponsestatustype option [@default None];
    (* Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  *)
    error_details: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Список заказов. *)
let create () : t = {
    id = None;
    status = None;
    substatus = None;
    update_status = None;
    error_details = None;
}

