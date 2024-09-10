-module(ympa_erlang_client_update_order_status_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_status_dto/0]).

-type ympa_erlang_client_update_order_status_dto() ::
    #{ 'id' => integer(),
       'status' => ympa_erlang_client_order_status_type:ympa_erlang_client_order_status_type(),
       'substatus' => ympa_erlang_client_order_substatus_type:ympa_erlang_client_order_substatus_type(),
       'updateStatus' => ympa_erlang_client_order_update_status_type:ympa_erlang_client_order_update_status_type(),
       'errorDetails' => binary()
     }.

encode(#{ 'id' := Id,
          'status' := Status,
          'substatus' := Substatus,
          'updateStatus' := UpdateStatus,
          'errorDetails' := ErrorDetails
        }) ->
    #{ 'id' => Id,
       'status' => Status,
       'substatus' => Substatus,
       'updateStatus' => UpdateStatus,
       'errorDetails' => ErrorDetails
     }.
