-module(ympa_erlang_client_set_feed_params_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_feed_params_request/0]).

-type ympa_erlang_client_set_feed_params_request() ::
    #{ 'parameters' := list()
     }.

encode(#{ 'parameters' := Parameters
        }) ->
    #{ 'parameters' => Parameters
     }.
