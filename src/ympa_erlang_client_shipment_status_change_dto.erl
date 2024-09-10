-module(ympa_erlang_client_shipment_status_change_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_shipment_status_change_dto/0]).

-type ympa_erlang_client_shipment_status_change_dto() ::
    #{ 'status' => ympa_erlang_client_shipment_status_type:ympa_erlang_client_shipment_status_type(),
       'description' => binary(),
       'updateTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'status' := Status,
          'description' := Description,
          'updateTime' := UpdateTime
        }) ->
    #{ 'status' => Status,
       'description' => Description,
       'updateTime' => UpdateTime
     }.
