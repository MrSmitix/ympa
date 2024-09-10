-module(ympa_erlang_client_warehouse_stock_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouse_stock_dto/0]).

-type ympa_erlang_client_warehouse_stock_dto() ::
    #{ 'type' := ympa_erlang_client_warehouse_stock_type:ympa_erlang_client_warehouse_stock_type(),
       'count' := integer()
     }.

encode(#{ 'type' := Type,
          'count' := Count
        }) ->
    #{ 'type' => Type,
       'count' => Count
     }.
