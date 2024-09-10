-module(ympa_erlang_client_offer_price_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_price_response_dto/0]).

-type ympa_erlang_client_offer_price_response_dto() ::
    #{ 'id' => binary(),
       'price' => ympa_erlang_client_price_dto:ympa_erlang_client_price_dto(),
       'marketSku' => integer(),
       'updatedAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'id' := Id,
          'price' := Price,
          'marketSku' := MarketSku,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'id' => Id,
       'price' => Price,
       'marketSku' => MarketSku,
       'updatedAt' => UpdatedAt
     }.
