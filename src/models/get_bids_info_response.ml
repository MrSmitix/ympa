(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_bids_info_response.t : description.
 *)

type t = {
    status: Enums.apiresponsestatustype option [@default None];
    _result: Get_bids_info_response_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** description. *)
let create () : t = {
    status = None;
    _result = None;
}

