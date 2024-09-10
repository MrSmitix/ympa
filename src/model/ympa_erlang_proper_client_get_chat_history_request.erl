-module(ympa_erlang_proper_client_get_chat_history_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_chat_history_request/0]).

-export([ympa_erlang_proper_client_get_chat_history_request/1]).

-export_type([ympa_erlang_proper_client_get_chat_history_request/0]).

-type ympa_erlang_proper_client_get_chat_history_request() ::
  [ {'messageIdFrom', integer() }
  ].


ympa_erlang_proper_client_get_chat_history_request() ->
    ympa_erlang_proper_client_get_chat_history_request([]).

ympa_erlang_proper_client_get_chat_history_request(Fields) ->
  Default = [ {'messageIdFrom', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

