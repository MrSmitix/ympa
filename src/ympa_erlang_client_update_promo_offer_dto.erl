-module(ympa_erlang_client_update_promo_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_promo_offer_dto/0]).

-type ympa_erlang_client_update_promo_offer_dto() ::
    #{ 'offerId' := binary(),
       'params' => ympa_erlang_client_update_promo_offer_params_dto:ympa_erlang_client_update_promo_offer_params_dto()
     }.

encode(#{ 'offerId' := OfferId,
          'params' := Params
        }) ->
    #{ 'offerId' => OfferId,
       'params' => Params
     }.
