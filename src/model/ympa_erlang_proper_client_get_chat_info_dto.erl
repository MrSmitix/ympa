-module(ympa_erlang_proper_client_get_chat_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_chat_info_dto/0]).

-export([ympa_erlang_proper_client_get_chat_info_dto/1]).

-export_type([ympa_erlang_proper_client_get_chat_info_dto/0]).

-type ympa_erlang_proper_client_get_chat_info_dto() ::
  [ {'chatId', integer() }
  | {'orderId', integer() }
  | {'type', ympa_erlang_proper_client_chat_type:ympa_erlang_proper_client_chat_type() }
  | {'status', ympa_erlang_proper_client_chat_status_type:ympa_erlang_proper_client_chat_status_type() }
  | {'createdAt', datetime() }
  | {'updatedAt', datetime() }
  ].


ympa_erlang_proper_client_get_chat_info_dto() ->
    ympa_erlang_proper_client_get_chat_info_dto([]).

ympa_erlang_proper_client_get_chat_info_dto(Fields) ->
  Default = [ {'chatId', integer() }
            , {'orderId', integer() }
            , {'type', ympa_erlang_proper_client_chat_type:ympa_erlang_proper_client_chat_type() }
            , {'status', ympa_erlang_proper_client_chat_status_type:ympa_erlang_proper_client_chat_status_type() }
            , {'createdAt', datetime() }
            , {'updatedAt', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

