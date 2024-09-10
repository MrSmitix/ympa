(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Sku_bid_recommendation_item_dto.t : Список товаров с рекомендованными ставками.
 *)

type t = {
    (* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  *)
    sku: string;
    (* Значение ставки. *)
    bid: int32;
    (* Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  *)
    bid_recommendations: Bid_recommendation_item_dto.t list;
    (* Рекомендованные цены. *)
    price_recommendations: Price_recommendation_item_dto.t list;
} [@@deriving yojson { strict = false }, show ];;

(** Список товаров с рекомендованными ставками. *)
let create (sku : string) (bid : int32) : t = {
    sku = sku;
    bid = bid;
    bid_recommendations = [];
    price_recommendations = [];
}

