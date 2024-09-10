-module(ympa_erlang_client_chat_messages_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_chat_messages_result_dto/0]).

-type ympa_erlang_client_chat_messages_result_dto() ::
    #{ 'orderId' := integer(),
       'messages' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'orderId' := OrderId,
          'messages' := Messages,
          'paging' := Paging
        }) ->
    #{ 'orderId' => OrderId,
       'messages' => Messages,
       'paging' => Paging
     }.
