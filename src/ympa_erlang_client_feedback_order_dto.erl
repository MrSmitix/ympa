-module(ympa_erlang_client_feedback_order_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_order_dto/0]).

-type ympa_erlang_client_feedback_order_dto() ::
    #{ 'shopOrderId' => binary(),
       'delivery' => ympa_erlang_client_feedback_delivery_type:ympa_erlang_client_feedback_delivery_type()
     }.

encode(#{ 'shopOrderId' := ShopOrderId,
          'delivery' := Delivery
        }) ->
    #{ 'shopOrderId' => ShopOrderId,
       'delivery' => Delivery
     }.
