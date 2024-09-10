(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Get_promo_offers_request.t : Получение списка товаров, которые участвуют или могут участвовать в акции.
 *)

type t = {
    (* Идентификатор акции. *)
    promo_id: string;
    status_type: Enums.promoofferparticipationstatusfiltertype option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Получение списка товаров, которые участвуют или могут участвовать в акции. *)
let create (promo_id : string) : t = {
    promo_id = promo_id;
    status_type = None;
}

