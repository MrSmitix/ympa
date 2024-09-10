-module(ympa_erlang_client_chat_message_payload_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_chat_message_payload_dto/0]).

-type ympa_erlang_client_chat_message_payload_dto() ::
    #{ 'name' := binary(),
       'url' := binary(),
       'size' := integer()
     }.

encode(#{ 'name' := Name,
          'url' := Url,
          'size' := Size
        }) ->
    #{ 'name' => Name,
       'url' => Url,
       'size' => Size
     }.
