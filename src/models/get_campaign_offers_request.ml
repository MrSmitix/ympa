(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_campaign_offers_request.t : Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 *)

type t = {
    (* Идентификаторы товаров, информация о которых нужна.  {% note warning \''Такой список возвращается только целиком\'' %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     *)
    offer_ids: string list;
    (* Фильтр по статусам товаров.  *)
    statuses: Enums.offercampaignstatustype list;
    (* Фильтр по категориям на Маркете. *)
    category_ids: int32 list;
    (* Фильтр по брендам. *)
    vendor_names: string list;
    (* Фильтр по тегам. *)
    tags: string list;
} [@@deriving yojson { strict = false }, show ];;

(** Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке.  *)
let create () : t = {
    offer_ids = [];
    statuses = [];
    category_ids = [];
    vendor_names = [];
    tags = [];
}

