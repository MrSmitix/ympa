-module(ympa_erlang_client_promo_offer_promocode_params_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_promo_offer_promocode_params_dto/0]).

-type ympa_erlang_client_promo_offer_promocode_params_dto() ::
    #{ 'maxPrice' := integer()
     }.

encode(#{ 'maxPrice' := MaxPrice
        }) ->
    #{ 'maxPrice' => MaxPrice
     }.
