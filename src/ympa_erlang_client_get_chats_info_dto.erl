-module(ympa_erlang_client_get_chats_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_chats_info_dto/0]).

-type ympa_erlang_client_get_chats_info_dto() ::
    #{ 'chats' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'chats' := Chats,
          'paging' := Paging
        }) ->
    #{ 'chats' => Chats,
       'paging' => Paging
     }.
