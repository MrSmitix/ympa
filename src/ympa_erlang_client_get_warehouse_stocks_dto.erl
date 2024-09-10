-module(ympa_erlang_client_get_warehouse_stocks_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_warehouse_stocks_dto/0]).

-type ympa_erlang_client_get_warehouse_stocks_dto() ::
    #{ 'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'warehouses' := list()
     }.

encode(#{ 'paging' := Paging,
          'warehouses' := Warehouses
        }) ->
    #{ 'paging' => Paging,
       'warehouses' => Warehouses
     }.
