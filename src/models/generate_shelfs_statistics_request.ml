(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Generate_shelfs_statistics_request.t : Данные, необходимые для генерации отчета. 
 *)

type t = {
    (* Идентификатор бизнеса. *)
    business_id: int64;
    (* Начало периода, включительно. *)
    date_from: string;
    (* Конец периода, включительно. *)
    date_to: string;
    attribution_type: Enums.shelfsstatisticsattributiontype;
} [@@deriving yojson { strict = false }, show ];;

(** Данные, необходимые для генерации отчета.  *)
let create (business_id : int64) (date_from : string) (date_to : string) (attribution_type : Enums.shelfsstatisticsattributiontype) : t = {
    business_id = business_id;
    date_from = date_from;
    date_to = date_to;
    attribution_type = attribution_type;
}

