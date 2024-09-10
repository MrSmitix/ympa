-module(ympa_erlang_client_create_chat_request).

-export([encode/1]).

-export_type([ympa_erlang_client_create_chat_request/0]).

-type ympa_erlang_client_create_chat_request() ::
    #{ 'orderId' := integer()
     }.

encode(#{ 'orderId' := OrderId
        }) ->
    #{ 'orderId' => OrderId
     }.
