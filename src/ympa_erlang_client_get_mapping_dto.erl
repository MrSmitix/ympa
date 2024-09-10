-module(ympa_erlang_client_get_mapping_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_mapping_dto/0]).

-type ympa_erlang_client_get_mapping_dto() ::
    #{ 'marketSku' => integer(),
       'marketSkuName' => binary(),
       'marketModelId' => integer(),
       'marketModelName' => binary(),
       'marketCategoryId' => integer(),
       'marketCategoryName' => binary()
     }.

encode(#{ 'marketSku' := MarketSku,
          'marketSkuName' := MarketSkuName,
          'marketModelId' := MarketModelId,
          'marketModelName' := MarketModelName,
          'marketCategoryId' := MarketCategoryId,
          'marketCategoryName' := MarketCategoryName
        }) ->
    #{ 'marketSku' => MarketSku,
       'marketSkuName' => MarketSkuName,
       'marketModelId' => MarketModelId,
       'marketModelName' => MarketModelName,
       'marketCategoryId' => MarketCategoryId,
       'marketCategoryName' => MarketCategoryName
     }.
