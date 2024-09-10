-module(ympa_erlang_client_goods_stats_warehouse_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_stats_warehouse_dto/0]).

-type ympa_erlang_client_goods_stats_warehouse_dto() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'stocks' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'stocks' := Stocks
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'stocks' => Stocks
     }.
