(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_models_request.t : Запрос информации о моделях.
 *)

type t = {
    (* Список моделей. *)
    models: int64 list;
} [@@deriving yojson { strict = false }, show ];;

(** Запрос информации о моделях. *)
let create (models : int64 list) : t = {
    models = models;
}

