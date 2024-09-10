-module(ympa_erlang_client_orders_stats_delivery_region_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_delivery_region_dto/0]).

-type ympa_erlang_client_orders_stats_delivery_region_dto() ::
    #{ 'id' => integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
