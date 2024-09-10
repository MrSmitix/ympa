-module(ympa_erlang_client_get_regions_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_regions_response/0]).

-type ympa_erlang_client_get_regions_response() ::
    #{ 'regions' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'regions' := Regions,
          'paging' := Paging
        }) ->
    #{ 'regions' => Regions,
       'paging' => Paging
     }.
