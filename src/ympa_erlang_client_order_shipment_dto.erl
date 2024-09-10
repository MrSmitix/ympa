-module(ympa_erlang_client_order_shipment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_shipment_dto/0]).

-type ympa_erlang_client_order_shipment_dto() ::
    #{ 'id' => integer(),
       'shipmentDate' => binary(),
       'shipmentTime' => binary(),
       'tracks' => list(),
       'boxes' => list()
     }.

encode(#{ 'id' := Id,
          'shipmentDate' := ShipmentDate,
          'shipmentTime' := ShipmentTime,
          'tracks' := Tracks,
          'boxes' := Boxes
        }) ->
    #{ 'id' => Id,
       'shipmentDate' => ShipmentDate,
       'shipmentTime' => ShipmentTime,
       'tracks' => Tracks,
       'boxes' => Boxes
     }.
