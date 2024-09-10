-module(ympa_erlang_client_warehouse_offers_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouse_offers_dto/0]).

-type ympa_erlang_client_warehouse_offers_dto() ::
    #{ 'warehouseId' := integer(),
       'offers' := list()
     }.

encode(#{ 'warehouseId' := WarehouseId,
          'offers' := Offers
        }) ->
    #{ 'warehouseId' => WarehouseId,
       'offers' => Offers
     }.
