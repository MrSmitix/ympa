-module(ympa_erlang_proper_client_get_chats_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_chats_request/0]).

-export([ympa_erlang_proper_client_get_chats_request/1]).

-export_type([ympa_erlang_proper_client_get_chats_request/0]).

-type ympa_erlang_proper_client_get_chats_request() ::
  [ {'orderIds', list(integer()) }
  | {'types', list(ympa_erlang_proper_client_chat_type:ympa_erlang_proper_client_chat_type()) }
  | {'statuses', list(ympa_erlang_proper_client_chat_status_type:ympa_erlang_proper_client_chat_status_type()) }
  ].


ympa_erlang_proper_client_get_chats_request() ->
    ympa_erlang_proper_client_get_chats_request([]).

ympa_erlang_proper_client_get_chats_request(Fields) ->
  Default = [ {'orderIds', list(integer(), 1) }
            , {'types', list(ympa_erlang_proper_client_chat_type:ympa_erlang_proper_client_chat_type(), 1) }
            , {'statuses', list(ympa_erlang_proper_client_chat_status_type:ympa_erlang_proper_client_chat_status_type(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

