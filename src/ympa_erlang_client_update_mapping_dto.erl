-module(ympa_erlang_client_update_mapping_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_mapping_dto/0]).

-type ympa_erlang_client_update_mapping_dto() ::
    #{ 'marketSku' => integer()
     }.

encode(#{ 'marketSku' := MarketSku
        }) ->
    #{ 'marketSku' => MarketSku
     }.
