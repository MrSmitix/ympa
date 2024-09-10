-module(ympa_erlang_client_get_orders_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_orders_response/0]).

-type ympa_erlang_client_get_orders_response() ::
    #{ 'pager' => ympa_erlang_client_flipping_pager_dto:ympa_erlang_client_flipping_pager_dto(),
       'orders' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'pager' := Pager,
          'orders' := Orders,
          'paging' := Paging
        }) ->
    #{ 'pager' => Pager,
       'orders' => Orders,
       'paging' => Paging
     }.
