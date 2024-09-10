-module(ympa_erlang_proper_client_get_chats_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_chats_info_dto/0]).

-export([ympa_erlang_proper_client_get_chats_info_dto/1]).

-export_type([ympa_erlang_proper_client_get_chats_info_dto/0]).

-type ympa_erlang_proper_client_get_chats_info_dto() ::
  [ {'chats', list(ympa_erlang_proper_client_get_chat_info_dto:ympa_erlang_proper_client_get_chat_info_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_get_chats_info_dto() ->
    ympa_erlang_proper_client_get_chats_info_dto([]).

ympa_erlang_proper_client_get_chats_info_dto(Fields) ->
  Default = [ {'chats', list(ympa_erlang_proper_client_get_chat_info_dto:ympa_erlang_proper_client_get_chat_info_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

