-module(ympa_erlang_client_get_bids_info_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_bids_info_response_dto/0]).

-type ympa_erlang_client_get_bids_info_response_dto() ::
    #{ 'bids' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'bids' := Bids,
          'paging' := Paging
        }) ->
    #{ 'bids' => Bids,
       'paging' => Paging
     }.
