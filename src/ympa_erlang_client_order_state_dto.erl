-module(ympa_erlang_client_order_state_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_state_dto/0]).

-type ympa_erlang_client_order_state_dto() ::
    #{ 'id' := integer(),
       'status' := ympa_erlang_client_order_status_type:ympa_erlang_client_order_status_type(),
       'substatus' => ympa_erlang_client_order_substatus_type:ympa_erlang_client_order_substatus_type()
     }.

encode(#{ 'id' := Id,
          'status' := Status,
          'substatus' := Substatus
        }) ->
    #{ 'id' => Id,
       'status' => Status,
       'substatus' => Substatus
     }.
