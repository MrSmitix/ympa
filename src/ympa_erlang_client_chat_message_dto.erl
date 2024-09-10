-module(ympa_erlang_client_chat_message_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_chat_message_dto/0]).

-type ympa_erlang_client_chat_message_dto() ::
    #{ 'messageId' := integer(),
       'createdAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'sender' := ympa_erlang_client_chat_message_sender_type:ympa_erlang_client_chat_message_sender_type(),
       'message' => binary(),
       'payload' => list()
     }.

encode(#{ 'messageId' := MessageId,
          'createdAt' := CreatedAt,
          'sender' := Sender,
          'message' := Message,
          'payload' := Payload
        }) ->
    #{ 'messageId' => MessageId,
       'createdAt' => CreatedAt,
       'sender' => Sender,
       'message' => Message,
       'payload' => Payload
     }.
