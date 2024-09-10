-module(ympa_erlang_client_set_order_delivery_track_code_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_order_delivery_track_code_request/0]).

-type ympa_erlang_client_set_order_delivery_track_code_request() ::
    #{ 'trackCode' := binary(),
       'deliveryServiceId' := integer()
     }.

encode(#{ 'trackCode' := TrackCode,
          'deliveryServiceId' := DeliveryServiceId
        }) ->
    #{ 'trackCode' => TrackCode,
       'deliveryServiceId' => DeliveryServiceId
     }.
