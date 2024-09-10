-module(ympa_erlang_client_get_feeds_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_feeds_response/0]).

-type ympa_erlang_client_get_feeds_response() ::
    #{ 'feeds' := list()
     }.

encode(#{ 'feeds' := Feeds
        }) ->
    #{ 'feeds' => Feeds
     }.
