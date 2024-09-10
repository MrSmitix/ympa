-module(ympa_erlang_client_warehouses_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouses_dto/0]).

-type ympa_erlang_client_warehouses_dto() ::
    #{ 'warehouses' := list(),
       'warehouseGroups' := list()
     }.

encode(#{ 'warehouses' := Warehouses,
          'warehouseGroups' := WarehouseGroups
        }) ->
    #{ 'warehouses' => Warehouses,
       'warehouseGroups' => WarehouseGroups
     }.
