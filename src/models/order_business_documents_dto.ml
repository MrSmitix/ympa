(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Order_business_documents_dto.t : Информация о документах. 
 *)

type t = {
    upd: Document_dto.t option [@default None];
    ukd: Document_dto.t option [@default None];
    torg_twelve: Document_dto.t option [@default None];
    sf: Document_dto.t option [@default None];
    ksf: Document_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о документах.  *)
let create () : t = {
    upd = None;
    ukd = None;
    torg_twelve = None;
    sf = None;
    ksf = None;
}

