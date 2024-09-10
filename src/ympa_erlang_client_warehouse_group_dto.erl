-module(ympa_erlang_client_warehouse_group_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouse_group_dto/0]).

-type ympa_erlang_client_warehouse_group_dto() ::
    #{ 'name' := binary(),
       'mainWarehouse' := ympa_erlang_client_warehouse_dto:ympa_erlang_client_warehouse_dto(),
       'warehouses' := list()
     }.

encode(#{ 'name' := Name,
          'mainWarehouse' := MainWarehouse,
          'warehouses' := Warehouses
        }) ->
    #{ 'name' => Name,
       'mainWarehouse' => MainWarehouse,
       'warehouses' => Warehouses
     }.
