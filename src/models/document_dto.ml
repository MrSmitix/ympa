(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Document_dto.t : Информация о документе.
 *)

type t = {
    status: Enums.orderdocumentstatustype option [@default None];
    (* Номер документа. *)
    number: string option [@default None];
    (* Дата создания документа. *)
    date: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о документе. *)
let create () : t = {
    status = None;
    number = None;
    date = None;
}

