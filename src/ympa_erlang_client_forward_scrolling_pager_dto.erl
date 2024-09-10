-module(ympa_erlang_client_forward_scrolling_pager_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_forward_scrolling_pager_dto/0]).

-type ympa_erlang_client_forward_scrolling_pager_dto() ::
    #{ 'nextPageToken' => binary()
     }.

encode(#{ 'nextPageToken' := NextPageToken
        }) ->
    #{ 'nextPageToken' => NextPageToken
     }.
