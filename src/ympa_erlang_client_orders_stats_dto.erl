-module(ympa_erlang_client_orders_stats_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_stats_dto/0]).

-type ympa_erlang_client_orders_stats_dto() ::
    #{ 'orders' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'orders' := Orders,
          'paging' := Paging
        }) ->
    #{ 'orders' => Orders,
       'paging' => Paging
     }.
