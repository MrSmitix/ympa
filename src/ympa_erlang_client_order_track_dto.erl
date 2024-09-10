-module(ympa_erlang_client_order_track_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_track_dto/0]).

-type ympa_erlang_client_order_track_dto() ::
    #{ 'trackCode' => binary(),
       'deliveryServiceId' => integer()
     }.

encode(#{ 'trackCode' := TrackCode,
          'deliveryServiceId' := DeliveryServiceId
        }) ->
    #{ 'trackCode' => TrackCode,
       'deliveryServiceId' => DeliveryServiceId
     }.
