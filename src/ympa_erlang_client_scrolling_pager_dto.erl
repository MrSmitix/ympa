-module(ympa_erlang_client_scrolling_pager_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_scrolling_pager_dto/0]).

-type ympa_erlang_client_scrolling_pager_dto() ::
    #{ 'nextPageToken' => binary(),
       'prevPageToken' => binary()
     }.

encode(#{ 'nextPageToken' := NextPageToken,
          'prevPageToken' := PrevPageToken
        }) ->
    #{ 'nextPageToken' => NextPageToken,
       'prevPageToken' => PrevPageToken
     }.
