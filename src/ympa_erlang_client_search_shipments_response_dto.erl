-module(ympa_erlang_client_search_shipments_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_search_shipments_response_dto/0]).

-type ympa_erlang_client_search_shipments_response_dto() ::
    #{ 'shipments' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'shipments' := Shipments,
          'paging' := Paging
        }) ->
    #{ 'shipments' => Shipments,
       'paging' => Paging
     }.
