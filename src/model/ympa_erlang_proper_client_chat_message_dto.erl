-module(ympa_erlang_proper_client_chat_message_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_chat_message_dto/0]).

-export([ympa_erlang_proper_client_chat_message_dto/1]).

-export_type([ympa_erlang_proper_client_chat_message_dto/0]).

-type ympa_erlang_proper_client_chat_message_dto() ::
  [ {'messageId', integer() }
  | {'createdAt', datetime() }
  | {'sender', ympa_erlang_proper_client_chat_message_sender_type:ympa_erlang_proper_client_chat_message_sender_type() }
  | {'message', binary() }
  | {'payload', list(ympa_erlang_proper_client_chat_message_payload_dto:ympa_erlang_proper_client_chat_message_payload_dto()) }
  ].


ympa_erlang_proper_client_chat_message_dto() ->
    ympa_erlang_proper_client_chat_message_dto([]).

ympa_erlang_proper_client_chat_message_dto(Fields) ->
  Default = [ {'messageId', integer() }
            , {'createdAt', datetime() }
            , {'sender', ympa_erlang_proper_client_chat_message_sender_type:ympa_erlang_proper_client_chat_message_sender_type() }
            , {'message', binary() }
            , {'payload', list(ympa_erlang_proper_client_chat_message_payload_dto:ympa_erlang_proper_client_chat_message_payload_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

