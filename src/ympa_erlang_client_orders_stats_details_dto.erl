-module(ympa_erlang_client_orders_stats_details_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_details_dto/0]).

-type ympa_erlang_client_orders_stats_details_dto() ::
    #{ 'itemStatus' => ympa_erlang_client_orders_stats_item_status_type:ympa_erlang_client_orders_stats_item_status_type(),
       'itemCount' => integer(),
       'updateDate' => calendar:date(),
       'stockType' => ympa_erlang_client_orders_stats_stock_type:ympa_erlang_client_orders_stats_stock_type()
     }.

encode(#{ 'itemStatus' := ItemStatus,
          'itemCount' := ItemCount,
          'updateDate' := UpdateDate,
          'stockType' := StockType
        }) ->
    #{ 'itemStatus' => ItemStatus,
       'itemCount' => ItemCount,
       'updateDate' => UpdateDate,
       'stockType' => StockType
     }.
