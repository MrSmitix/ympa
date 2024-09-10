-module(ympa_erlang_client_price_suggest_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_suggest_dto/0]).

-type ympa_erlang_client_price_suggest_dto() ::
    #{ 'type' => ympa_erlang_client_price_suggest_type:ympa_erlang_client_price_suggest_type(),
       'price' => integer()
     }.

encode(#{ 'type' := Type,
          'price' := Price
        }) ->
    #{ 'type' => Type,
       'price' => Price
     }.
