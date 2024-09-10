-module(ympa_erlang_client_price_suggest_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_suggest_offer_dto/0]).

-type ympa_erlang_client_price_suggest_offer_dto() ::
    #{ 'marketSku' => integer(),
       'offerId' => binary(),
       'priceSuggestion' => list()
     }.

encode(#{ 'marketSku' := MarketSku,
          'offerId' := OfferId,
          'priceSuggestion' := PriceSuggestion
        }) ->
    #{ 'marketSku' => MarketSku,
       'offerId' => OfferId,
       'priceSuggestion' => PriceSuggestion
     }.
