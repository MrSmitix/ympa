-module(ympa_erlang_client_fulfillment_warehouses_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_fulfillment_warehouses_dto/0]).

-type ympa_erlang_client_fulfillment_warehouses_dto() ::
    #{ 'warehouses' := list()
     }.

encode(#{ 'warehouses' := Warehouses
        }) ->
    #{ 'warehouses' => Warehouses
     }.
