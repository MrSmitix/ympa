-module(ympa_erlang_client_set_shipment_pallets_count_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_shipment_pallets_count_request/0]).

-type ympa_erlang_client_set_shipment_pallets_count_request() ::
    #{ 'placesCount' := integer()
     }.

encode(#{ 'placesCount' := PlacesCount
        }) ->
    #{ 'placesCount' => PlacesCount
     }.
