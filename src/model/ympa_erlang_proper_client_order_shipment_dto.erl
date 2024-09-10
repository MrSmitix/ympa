-module(ympa_erlang_proper_client_order_shipment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_shipment_dto/0]).

-export([ympa_erlang_proper_client_order_shipment_dto/1]).

-export_type([ympa_erlang_proper_client_order_shipment_dto/0]).

-type ympa_erlang_proper_client_order_shipment_dto() ::
  [ {'id', integer() }
  | {'shipmentDate', binary() }
  | {'shipmentTime', binary() }
  | {'tracks', list(ympa_erlang_proper_client_order_track_dto:ympa_erlang_proper_client_order_track_dto()) }
  | {'boxes', list(ympa_erlang_proper_client_order_parcel_box_dto:ympa_erlang_proper_client_order_parcel_box_dto()) }
  ].


ympa_erlang_proper_client_order_shipment_dto() ->
    ympa_erlang_proper_client_order_shipment_dto([]).

ympa_erlang_proper_client_order_shipment_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'shipmentDate', binary() }
            , {'shipmentTime', binary() }
            , {'tracks', list(ympa_erlang_proper_client_order_track_dto:ympa_erlang_proper_client_order_track_dto()) }
            , {'boxes', list(ympa_erlang_proper_client_order_parcel_box_dto:ympa_erlang_proper_client_order_parcel_box_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

