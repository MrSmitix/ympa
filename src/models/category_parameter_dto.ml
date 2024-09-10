(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Category_parameter_dto.t : Характеристика товара.
 *)

type t = {
    (* Идентификатор характеристики. *)
    id: int64;
    (* Название характеристики. *)
    name: string option [@default None];
    _type: Enums.parametertype;
    unit: Category_parameter_unit_dto.t option [@default None];
    (* Описание характеристики. *)
    description: string option [@default None];
    (* Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. *)
    recommendation_types: Enums.offercardrecommendationtype list;
    (* Обязательность характеристики. *)
    required: bool;
    (* Используется ли характеристика в фильтре. *)
    filtering: bool;
    (* Является ли характеристика особенностью варианта. *)
    distinctive: bool;
    (* Можно ли передать сразу несколько значений. *)
    multivalue: bool;
    (* Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. *)
    allow_custom_values: bool;
    (* Список допустимых значений параметра. Только для характеристик типа `ENUM`. *)
    values: Parameter_value_option_dto.t list;
    constraints: Parameter_value_constraints_dto.t option [@default None];
    (* Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. *)
    value_restrictions: Value_restriction_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** Характеристика товара. *)
let create (id : int64) (_type : Enums.parametertype) (required : bool) (filtering : bool) (distinctive : bool) (multivalue : bool) (allow_custom_values : bool) : t = {
    id = id;
    name = None;
    _type = _type;
    unit = None;
    description = None;
    recommendation_types = [];
    required = required;
    filtering = filtering;
    distinctive = distinctive;
    multivalue = multivalue;
    allow_custom_values = allow_custom_values;
    values = [];
    constraints = None;
    value_restrictions = [];
}

