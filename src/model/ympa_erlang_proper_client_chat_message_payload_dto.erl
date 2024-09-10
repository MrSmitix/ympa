-module(ympa_erlang_proper_client_chat_message_payload_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_chat_message_payload_dto/0]).

-export([ympa_erlang_proper_client_chat_message_payload_dto/1]).

-export_type([ympa_erlang_proper_client_chat_message_payload_dto/0]).

-type ympa_erlang_proper_client_chat_message_payload_dto() ::
  [ {'name', binary() }
  | {'url', binary() }
  | {'size', integer() }
  ].


ympa_erlang_proper_client_chat_message_payload_dto() ->
    ympa_erlang_proper_client_chat_message_payload_dto([]).

ympa_erlang_proper_client_chat_message_payload_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            , {'size', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

