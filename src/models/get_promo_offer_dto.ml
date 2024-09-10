(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_promo_offer_dto.t : Товар, который участвует или может участвовать в акции.
 *)

type t = {
    (* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  *)
    offer_id: string;
    status: Enums.promoofferparticipationstatustype;
    params: Promo_offer_params_dto.t;
    auto_participating_details: Promo_offer_auto_participating_details_dto.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Товар, который участвует или может участвовать в акции. *)
let create (offer_id : string) (status : Enums.promoofferparticipationstatustype) (params : Promo_offer_params_dto.t) : t = {
    offer_id = offer_id;
    status = status;
    params = params;
    auto_participating_details = None;
}

