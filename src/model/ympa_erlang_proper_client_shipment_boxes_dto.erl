-module(ympa_erlang_proper_client_shipment_boxes_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shipment_boxes_dto/0]).

-export([ympa_erlang_proper_client_shipment_boxes_dto/1]).

-export_type([ympa_erlang_proper_client_shipment_boxes_dto/0]).

-type ympa_erlang_proper_client_shipment_boxes_dto() ::
  [ {'boxes', list(ympa_erlang_proper_client_parcel_box_dto:ympa_erlang_proper_client_parcel_box_dto()) }
  ].


ympa_erlang_proper_client_shipment_boxes_dto() ->
    ympa_erlang_proper_client_shipment_boxes_dto([]).

ympa_erlang_proper_client_shipment_boxes_dto(Fields) ->
  Default = [ {'boxes', list(ympa_erlang_proper_client_parcel_box_dto:ympa_erlang_proper_client_parcel_box_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

