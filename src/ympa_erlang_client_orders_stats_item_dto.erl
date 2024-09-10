-module(ympa_erlang_client_orders_stats_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_item_dto/0]).

-type ympa_erlang_client_orders_stats_item_dto() ::
    #{ 'offerName' => binary(),
       'marketSku' => integer(),
       'shopSku' => binary(),
       'count' => integer(),
       'prices' => list(),
       'warehouse' => ympa_erlang_client_orders_stats_warehouse_dto:ympa_erlang_client_orders_stats_warehouse_dto(),
       'details' => list(),
       'cisList' => list(),
       'initialCount' => integer(),
       'bidFee' => integer(),
       'cofinanceThreshold' => integer(),
       'cofinanceValue' => integer()
     }.

encode(#{ 'offerName' := OfferName,
          'marketSku' := MarketSku,
          'shopSku' := ShopSku,
          'count' := Count,
          'prices' := Prices,
          'warehouse' := Warehouse,
          'details' := Details,
          'cisList' := CisList,
          'initialCount' := InitialCount,
          'bidFee' := BidFee,
          'cofinanceThreshold' := CofinanceThreshold,
          'cofinanceValue' := CofinanceValue
        }) ->
    #{ 'offerName' => OfferName,
       'marketSku' => MarketSku,
       'shopSku' => ShopSku,
       'count' => Count,
       'prices' => Prices,
       'warehouse' => Warehouse,
       'details' => Details,
       'cisList' => CisList,
       'initialCount' => InitialCount,
       'bidFee' => BidFee,
       'cofinanceThreshold' => CofinanceThreshold,
       'cofinanceValue' => CofinanceValue
     }.
