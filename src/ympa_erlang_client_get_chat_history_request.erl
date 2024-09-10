-module(ympa_erlang_client_get_chat_history_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_chat_history_request/0]).

-type ympa_erlang_client_get_chat_history_request() ::
    #{ 'messageIdFrom' => integer()
     }.

encode(#{ 'messageIdFrom' := MessageIdFrom
        }) ->
    #{ 'messageIdFrom' => MessageIdFrom
     }.
