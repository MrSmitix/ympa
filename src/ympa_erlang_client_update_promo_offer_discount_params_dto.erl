-module(ympa_erlang_client_update_promo_offer_discount_params_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_promo_offer_discount_params_dto/0]).

-type ympa_erlang_client_update_promo_offer_discount_params_dto() ::
    #{ 'price' => integer(),
       'promoPrice' => integer()
     }.

encode(#{ 'price' := Price,
          'promoPrice' := PromoPrice
        }) ->
    #{ 'price' => Price,
       'promoPrice' => PromoPrice
     }.
