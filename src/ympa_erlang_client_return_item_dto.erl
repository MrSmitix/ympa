-module(ympa_erlang_client_return_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_return_item_dto/0]).

-type ympa_erlang_client_return_item_dto() ::
    #{ 'marketSku' => integer(),
       'shopSku' := binary(),
       'count' := integer(),
       'decisions' => list(),
       'instances' => list(),
       'tracks' => list()
     }.

encode(#{ 'marketSku' := MarketSku,
          'shopSku' := ShopSku,
          'count' := Count,
          'decisions' := Decisions,
          'instances' := Instances,
          'tracks' := Tracks
        }) ->
    #{ 'marketSku' => MarketSku,
       'shopSku' => ShopSku,
       'count' => Count,
       'decisions' => Decisions,
       'instances' => Instances,
       'tracks' => Tracks
     }.
