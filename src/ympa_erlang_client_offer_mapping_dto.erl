-module(ympa_erlang_client_offer_mapping_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_mapping_dto/0]).

-type ympa_erlang_client_offer_mapping_dto() ::
    #{ 'marketSku' => integer(),
       'modelId' => integer(),
       'categoryId' => integer()
     }.

encode(#{ 'marketSku' := MarketSku,
          'modelId' := ModelId,
          'categoryId' := CategoryId
        }) ->
    #{ 'marketSku' => MarketSku,
       'modelId' => ModelId,
       'categoryId' => CategoryId
     }.
