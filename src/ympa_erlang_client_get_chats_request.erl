-module(ympa_erlang_client_get_chats_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_chats_request/0]).

-type ympa_erlang_client_get_chats_request() ::
    #{ 'orderIds' => list(),
       'types' => list(),
       'statuses' => list()
     }.

encode(#{ 'orderIds' := OrderIds,
          'types' := Types,
          'statuses' := Statuses
        }) ->
    #{ 'orderIds' => OrderIds,
       'types' => Types,
       'statuses' => Statuses
     }.
