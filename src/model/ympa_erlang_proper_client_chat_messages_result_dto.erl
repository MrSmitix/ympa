-module(ympa_erlang_proper_client_chat_messages_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_chat_messages_result_dto/0]).

-export([ympa_erlang_proper_client_chat_messages_result_dto/1]).

-export_type([ympa_erlang_proper_client_chat_messages_result_dto/0]).

-type ympa_erlang_proper_client_chat_messages_result_dto() ::
  [ {'orderId', integer() }
  | {'messages', list(ympa_erlang_proper_client_chat_message_dto:ympa_erlang_proper_client_chat_message_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_chat_messages_result_dto() ->
    ympa_erlang_proper_client_chat_messages_result_dto([]).

ympa_erlang_proper_client_chat_messages_result_dto(Fields) ->
  Default = [ {'orderId', integer() }
            , {'messages', list(ympa_erlang_proper_client_chat_message_dto:ympa_erlang_proper_client_chat_message_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

