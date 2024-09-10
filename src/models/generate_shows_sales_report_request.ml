(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Generate_shows_sales_report_request.t : Данные, необходимые для генерации отчета.
 *)

type t = {
    (* Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  *)
    business_id: int64 option [@default None];
    (* Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  *)
    campaign_id: int64 option [@default None];
    (* Начало периода, включительно. *)
    date_from: string;
    (* Конец периода, включительно. *)
    date_to: string;
    grouping: Enums.showssalesgroupingtype;
} [@@deriving yojson { strict = false }, show ];;

(** Данные, необходимые для генерации отчета. *)
let create (date_from : string) (date_to : string) (grouping : Enums.showssalesgroupingtype) : t = {
    business_id = None;
    campaign_id = None;
    date_from = date_from;
    date_to = date_to;
    grouping = grouping;
}

