(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Generate_competitors_position_report_request.t : Данные, необходимые для генерации отчета.
 *)

type t = {
    (* Идентификатор бизнеса. *)
    business_id: int64;
    (* Идентификатор категории. *)
    category_id: int64;
    (* Начало периода, включительно. *)
    date_from: string;
    (* Конец периода, включительно. *)
    date_to: string;
} [@@deriving yojson { strict = false }, show ];;

(** Данные, необходимые для генерации отчета. *)
let create (business_id : int64) (category_id : int64) (date_from : string) (date_to : string) : t = {
    business_id = business_id;
    category_id = category_id;
    date_from = date_from;
    date_to = date_to;
}

