-module(ympa_erlang_client_order_status_change_delivery_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_status_change_delivery_dto/0]).

-type ympa_erlang_client_order_status_change_delivery_dto() ::
    #{ 'dates' => ympa_erlang_client_order_status_change_delivery_dates_dto:ympa_erlang_client_order_status_change_delivery_dates_dto()
     }.

encode(#{ 'dates' := Dates
        }) ->
    #{ 'dates' => Dates
     }.
