(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Feed_dto.t : Информация о прайс-листе.
 *)

type t = {
    (* Идентификатор прайс-листа. *)
    id: int64 option [@default None];
    (* Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  *)
    login: string option [@default None];
    (* Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  *)
    name: string option [@default None];
    (* Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  *)
    password: string option [@default None];
    (* Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.  *)
    upload_date: string option [@default None];
    (* URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  *)
    url: string option [@default None];
    content: Feed_content_dto.t option [@default None];
    download: Feed_download_dto.t option [@default None];
    placement: Feed_placement_dto.t option [@default None];
    publication: Feed_publication_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о прайс-листе. *)
let create () : t = {
    id = None;
    login = None;
    name = None;
    password = None;
    upload_date = None;
    url = None;
    content = None;
    download = None;
    placement = None;
    publication = None;
}

