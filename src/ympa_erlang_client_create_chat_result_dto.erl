-module(ympa_erlang_client_create_chat_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_create_chat_result_dto/0]).

-type ympa_erlang_client_create_chat_result_dto() ::
    #{ 'chatId' := integer()
     }.

encode(#{ 'chatId' := ChatId
        }) ->
    #{ 'chatId' => ChatId
     }.
