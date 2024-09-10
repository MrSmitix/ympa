-module(ympa_erlang_proper_client_get_chat_history_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_chat_history_response/0]).

-export([ympa_erlang_proper_client_get_chat_history_response/1]).

-export_type([ympa_erlang_proper_client_get_chat_history_response/0]).

-type ympa_erlang_proper_client_get_chat_history_response() ::
  [ {'status', ympa_erlang_proper_client_api_response_status_type:ympa_erlang_proper_client_api_response_status_type() }
  | {'result', ympa_erlang_proper_client_chat_messages_result_dto:ympa_erlang_proper_client_chat_messages_result_dto() }
  ].


ympa_erlang_proper_client_get_chat_history_response() ->
    ympa_erlang_proper_client_get_chat_history_response([]).

ympa_erlang_proper_client_get_chat_history_response(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_api_response_status_type:ympa_erlang_proper_client_api_response_status_type() }
            , {'result', ympa_erlang_proper_client_chat_messages_result_dto:ympa_erlang_proper_client_chat_messages_result_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

