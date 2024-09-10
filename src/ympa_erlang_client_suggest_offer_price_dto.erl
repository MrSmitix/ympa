-module(ympa_erlang_client_suggest_offer_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_suggest_offer_price_dto/0]).

-type ympa_erlang_client_suggest_offer_price_dto() ::
    #{ 'offerId' => binary(),
       'marketSku' => integer()
     }.

encode(#{ 'offerId' := OfferId,
          'marketSku' := MarketSku
        }) ->
    #{ 'offerId' => OfferId,
       'marketSku' => MarketSku
     }.
