(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Flipping_pager_dto.t : Модель для пагинации.
 *)

type t = {
    (* Сколько всего найдено элементов. *)
    total: int32 option [@default None];
    (* Начальный номер найденного элемента на странице. *)
    from: int32 option [@default None];
    (* Конечный номер найденного элемента на странице. *)
    _to: int32 option [@default None];
    (* Текущая страница. *)
    current_page: int32 option [@default None];
    (* Общее количество страниц. *)
    pages_count: int32 option [@default None];
    (* Размер страницы. *)
    page_size: int32 option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Модель для пагинации. *)
let create () : t = {
    total = None;
    from = None;
    _to = None;
    current_page = None;
    pages_count = None;
    page_size = None;
}

