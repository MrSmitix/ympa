-module(ympa_erlang_client_confirm_shipment_request).

-export([encode/1]).

-export_type([ympa_erlang_client_confirm_shipment_request/0]).

-type ympa_erlang_client_confirm_shipment_request() ::
    #{ 'externalShipmentId' => binary()
     }.

encode(#{ 'externalShipmentId' := ExternalShipmentId
        }) ->
    #{ 'externalShipmentId' => ExternalShipmentId
     }.
