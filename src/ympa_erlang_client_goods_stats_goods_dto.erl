-module(ympa_erlang_client_goods_stats_goods_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_stats_goods_dto/0]).

-type ympa_erlang_client_goods_stats_goods_dto() ::
    #{ 'shopSku' => binary(),
       'marketSku' => integer(),
       'name' => binary(),
       'price' => integer(),
       'categoryId' => integer(),
       'categoryName' => binary(),
       'weightDimensions' => ympa_erlang_client_goods_stats_weight_dimensions_dto:ympa_erlang_client_goods_stats_weight_dimensions_dto(),
       'warehouses' => list(),
       'tariffs' => list(),
       'pictures' => list()
     }.

encode(#{ 'shopSku' := ShopSku,
          'marketSku' := MarketSku,
          'name' := Name,
          'price' := Price,
          'categoryId' := CategoryId,
          'categoryName' := CategoryName,
          'weightDimensions' := WeightDimensions,
          'warehouses' := Warehouses,
          'tariffs' := Tariffs,
          'pictures' := Pictures
        }) ->
    #{ 'shopSku' => ShopSku,
       'marketSku' => MarketSku,
       'name' => Name,
       'price' => Price,
       'categoryId' => CategoryId,
       'categoryName' => CategoryName,
       'weightDimensions' => WeightDimensions,
       'warehouses' => Warehouses,
       'tariffs' => Tariffs,
       'pictures' => Pictures
     }.
