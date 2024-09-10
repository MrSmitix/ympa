-module(ympa_erlang_proper_client_confirm_shipment_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_confirm_shipment_request/0]).

-export([ympa_erlang_proper_client_confirm_shipment_request/1]).

-export_type([ympa_erlang_proper_client_confirm_shipment_request/0]).

-type ympa_erlang_proper_client_confirm_shipment_request() ::
  [ {'externalShipmentId', binary() }
  ].


ympa_erlang_proper_client_confirm_shipment_request() ->
    ympa_erlang_proper_client_confirm_shipment_request([]).

ympa_erlang_proper_client_confirm_shipment_request(Fields) ->
  Default = [ {'externalShipmentId', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

