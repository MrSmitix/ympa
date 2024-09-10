(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_goods_feedback_request.t : Фильтр запроса отзывов в кабинете. 
 *)

type t = {
    (* Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  *)
    date_time_from: string option [@default None];
    (* Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  *)
    date_time_to: string option [@default None];
    reaction_status: Enums.feedbackreactionstatustype option [@default None];
    (* Оценка товара. *)
    rating_values: int32 list;
    (* Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  *)
    model_ids: int64 list;
    (* Фильтр отзывов за баллы Плюса. *)
    paid: bool option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Фильтр запроса отзывов в кабинете.  *)
let create () : t = {
    date_time_from = None;
    date_time_to = None;
    reaction_status = None;
    rating_values = [];
    model_ids = [];
    paid = None;
}

