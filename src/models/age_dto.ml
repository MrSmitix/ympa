(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Age_dto.t : Возраст в заданных единицах измерения.
 *)

type t = {
    (* Значение.  *)
    value: float;
    age_unit: Enums.ageunittype;
} [@@deriving yojson { strict = false }, show ];;

(** Возраст в заданных единицах измерения. *)
let create (value : float) (age_unit : Enums.ageunittype) : t = {
    value = value;
    age_unit = age_unit;
}

