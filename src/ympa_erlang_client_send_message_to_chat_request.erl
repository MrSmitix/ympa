-module(ympa_erlang_client_send_message_to_chat_request).

-export([encode/1]).

-export_type([ympa_erlang_client_send_message_to_chat_request/0]).

-type ympa_erlang_client_send_message_to_chat_request() ::
    #{ 'message' := binary()
     }.

encode(#{ 'message' := Message
        }) ->
    #{ 'message' => Message
     }.
