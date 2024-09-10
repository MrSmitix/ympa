-module(ympa_erlang_client_get_outlets_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_outlets_response/0]).

-type ympa_erlang_client_get_outlets_response() ::
    #{ 'outlets' := list(),
       'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'pager' => ympa_erlang_client_flipping_pager_dto:ympa_erlang_client_flipping_pager_dto()
     }.

encode(#{ 'outlets' := Outlets,
          'paging' := Paging,
          'pager' := Pager
        }) ->
    #{ 'outlets' => Outlets,
       'paging' => Paging,
       'pager' => Pager
     }.
