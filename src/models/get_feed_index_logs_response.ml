(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    status: Enums.apiresponsestatustype option [@default None];
    _result: Feed_index_logs_result_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    status = None;
    _result = None;
}

