-module(ympa_erlang_proper_client_chat_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_chat_status_type/0]).

-export_type([ympa_erlang_proper_client_chat_status_type/0]).

-type ympa_erlang_proper_client_chat_status_type() ::
  binary().

ympa_erlang_proper_client_chat_status_type() ->
  elements([<<"NEW">>, <<"WAITING_FOR_CUSTOMER">>, <<"WAITING_FOR_PARTNER">>, <<"WAITING_FOR_ARBITER">>, <<"WAITING_FOR_MARKET">>, <<"FINISHED">>]).

