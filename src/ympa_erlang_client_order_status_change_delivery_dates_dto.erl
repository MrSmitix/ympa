-module(ympa_erlang_client_order_status_change_delivery_dates_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_status_change_delivery_dates_dto/0]).

-type ympa_erlang_client_order_status_change_delivery_dates_dto() ::
    #{ 'realDeliveryDate' => calendar:date()
     }.

encode(#{ 'realDeliveryDate' := RealDeliveryDate
        }) ->
    #{ 'realDeliveryDate' => RealDeliveryDate
     }.
