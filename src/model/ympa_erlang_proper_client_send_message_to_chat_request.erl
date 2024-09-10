-module(ympa_erlang_proper_client_send_message_to_chat_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_send_message_to_chat_request/0]).

-export([ympa_erlang_proper_client_send_message_to_chat_request/1]).

-export_type([ympa_erlang_proper_client_send_message_to_chat_request/0]).

-type ympa_erlang_proper_client_send_message_to_chat_request() ::
  [ {'message', binary() }
  ].


ympa_erlang_proper_client_send_message_to_chat_request() ->
    ympa_erlang_proper_client_send_message_to_chat_request([]).

ympa_erlang_proper_client_send_message_to_chat_request(Fields) ->
  Default = [ {'message', binary(1, 4096) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

