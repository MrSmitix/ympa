-module(ympa_erlang_client_get_promo_constraints_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_constraints_dto/0]).

-type ympa_erlang_client_get_promo_constraints_dto() ::
    #{ 'warehouseIds' => list()
     }.

encode(#{ 'warehouseIds' := WarehouseIds
        }) ->
    #{ 'warehouseIds' => WarehouseIds
     }.
