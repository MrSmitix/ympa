-module(ympa_erlang_client_update_order_item_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_item_request/0]).

-type ympa_erlang_client_update_order_item_request() ::
    #{ 'items' := list(),
       'reason' => ympa_erlang_client_order_items_modification_request_reason_type:ympa_erlang_client_order_items_modification_request_reason_type()
     }.

encode(#{ 'items' := Items,
          'reason' := Reason
        }) ->
    #{ 'items' => Items,
       'reason' => Reason
     }.
