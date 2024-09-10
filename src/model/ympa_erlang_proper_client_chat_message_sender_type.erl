-module(ympa_erlang_proper_client_chat_message_sender_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_chat_message_sender_type/0]).

-export_type([ympa_erlang_proper_client_chat_message_sender_type/0]).

-type ympa_erlang_proper_client_chat_message_sender_type() ::
  binary().

ympa_erlang_proper_client_chat_message_sender_type() ->
  elements([<<"PARTNER">>, <<"CUSTOMER">>, <<"MARKET">>, <<"SUPPORT">>]).

