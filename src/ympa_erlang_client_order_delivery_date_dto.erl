-module(ympa_erlang_client_order_delivery_date_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_delivery_date_dto/0]).

-type ympa_erlang_client_order_delivery_date_dto() ::
    #{ 'toDate' := calendar:date()
     }.

encode(#{ 'toDate' := ToDate
        }) ->
    #{ 'toDate' => ToDate
     }.
