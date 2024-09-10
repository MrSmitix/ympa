-module(ympa_erlang_client_paged_returns_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_paged_returns_dto/0]).

-type ympa_erlang_client_paged_returns_dto() ::
    #{ 'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto(),
       'returns' := list()
     }.

encode(#{ 'paging' := Paging,
          'returns' := Returns
        }) ->
    #{ 'paging' => Paging,
       'returns' => Returns
     }.
