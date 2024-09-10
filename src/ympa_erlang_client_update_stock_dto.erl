-module(ympa_erlang_client_update_stock_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_stock_dto/0]).

-type ympa_erlang_client_update_stock_dto() ::
    #{ 'sku' := binary(),
       'items' := list()
     }.

encode(#{ 'sku' := Sku,
          'items' := Items
        }) ->
    #{ 'sku' => Sku,
       'items' => Items
     }.
