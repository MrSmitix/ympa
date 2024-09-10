-module(ympa_erlang_client_order_status_change_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_status_change_dto/0]).

-type ympa_erlang_client_order_status_change_dto() ::
    #{ 'status' := ympa_erlang_client_order_status_type:ympa_erlang_client_order_status_type(),
       'substatus' => ympa_erlang_client_order_substatus_type:ympa_erlang_client_order_substatus_type(),
       'delivery' => ympa_erlang_client_order_status_change_delivery_dto:ympa_erlang_client_order_status_change_delivery_dto()
     }.

encode(#{ 'status' := Status,
          'substatus' := Substatus,
          'delivery' := Delivery
        }) ->
    #{ 'status' => Status,
       'substatus' => Substatus,
       'delivery' => Delivery
     }.
