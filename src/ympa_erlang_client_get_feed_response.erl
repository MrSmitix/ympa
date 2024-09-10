-module(ympa_erlang_client_get_feed_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_feed_response/0]).

-type ympa_erlang_client_get_feed_response() ::
    #{ 'feed' => ympa_erlang_client_feed_dto:ympa_erlang_client_feed_dto()
     }.

encode(#{ 'feed' := Feed
        }) ->
    #{ 'feed' => Feed
     }.
