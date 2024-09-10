-module(ympa_erlang_client_promo_offer_discount_params_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_promo_offer_discount_params_dto/0]).

-type ympa_erlang_client_promo_offer_discount_params_dto() ::
    #{ 'price' => integer(),
       'promoPrice' => integer(),
       'maxPromoPrice' := integer()
     }.

encode(#{ 'price' := Price,
          'promoPrice' := PromoPrice,
          'maxPromoPrice' := MaxPromoPrice
        }) ->
    #{ 'price' => Price,
       'promoPrice' => PromoPrice,
       'maxPromoPrice' => MaxPromoPrice
     }.
