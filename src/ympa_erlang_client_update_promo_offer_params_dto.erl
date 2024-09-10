-module(ympa_erlang_client_update_promo_offer_params_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_promo_offer_params_dto/0]).

-type ympa_erlang_client_update_promo_offer_params_dto() ::
    #{ 'discountParams' => ympa_erlang_client_update_promo_offer_discount_params_dto:ympa_erlang_client_update_promo_offer_discount_params_dto()
     }.

encode(#{ 'discountParams' := DiscountParams
        }) ->
    #{ 'discountParams' => DiscountParams
     }.
