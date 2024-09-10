-module(ympa_erlang_proper_client_set_order_shipment_boxes_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_order_shipment_boxes_request/0]).

-export([ympa_erlang_proper_client_set_order_shipment_boxes_request/1]).

-export_type([ympa_erlang_proper_client_set_order_shipment_boxes_request/0]).

-type ympa_erlang_proper_client_set_order_shipment_boxes_request() ::
  [ {'boxes', list(ympa_erlang_proper_client_parcel_box_dto:ympa_erlang_proper_client_parcel_box_dto()) }
  ].


ympa_erlang_proper_client_set_order_shipment_boxes_request() ->
    ympa_erlang_proper_client_set_order_shipment_boxes_request([]).

ympa_erlang_proper_client_set_order_shipment_boxes_request(Fields) ->
  Default = [ {'boxes', list(ympa_erlang_proper_client_parcel_box_dto:ympa_erlang_proper_client_parcel_box_dto(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

