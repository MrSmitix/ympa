-module(ympa_erlang_client_transfer_orders_from_shipment_request).

-export([encode/1]).

-export_type([ympa_erlang_client_transfer_orders_from_shipment_request/0]).

-type ympa_erlang_client_transfer_orders_from_shipment_request() ::
    #{ 'orderIds' := list()
     }.

encode(#{ 'orderIds' := OrderIds
        }) ->
    #{ 'orderIds' => OrderIds
     }.
