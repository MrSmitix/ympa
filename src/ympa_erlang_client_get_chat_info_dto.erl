-module(ympa_erlang_client_get_chat_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_chat_info_dto/0]).

-type ympa_erlang_client_get_chat_info_dto() ::
    #{ 'chatId' := integer(),
       'orderId' := integer(),
       'type' := ympa_erlang_client_chat_type:ympa_erlang_client_chat_type(),
       'status' := ympa_erlang_client_chat_status_type:ympa_erlang_client_chat_status_type(),
       'createdAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'updatedAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'chatId' := ChatId,
          'orderId' := OrderId,
          'type' := Type,
          'status' := Status,
          'createdAt' := CreatedAt,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'chatId' => ChatId,
       'orderId' => OrderId,
       'type' => Type,
       'status' => Status,
       'createdAt' => CreatedAt,
       'updatedAt' => UpdatedAt
     }.
