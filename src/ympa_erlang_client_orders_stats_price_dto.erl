-module(ympa_erlang_client_orders_stats_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_price_dto/0]).

-type ympa_erlang_client_orders_stats_price_dto() ::
    #{ 'type' => ympa_erlang_client_orders_stats_price_type:ympa_erlang_client_orders_stats_price_type(),
       'costPerItem' => integer(),
       'total' => integer()
     }.

encode(#{ 'type' := Type,
          'costPerItem' := CostPerItem,
          'total' := Total
        }) ->
    #{ 'type' => Type,
       'costPerItem' => CostPerItem,
       'total' => Total
     }.
