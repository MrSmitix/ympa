-module(ympa_erlang_proper_client_transfer_orders_from_shipment_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_transfer_orders_from_shipment_request/0]).

-export([ympa_erlang_proper_client_transfer_orders_from_shipment_request/1]).

-export_type([ympa_erlang_proper_client_transfer_orders_from_shipment_request/0]).

-type ympa_erlang_proper_client_transfer_orders_from_shipment_request() ::
  [ {'orderIds', list(integer()) }
  ].


ympa_erlang_proper_client_transfer_orders_from_shipment_request() ->
    ympa_erlang_proper_client_transfer_orders_from_shipment_request([]).

ympa_erlang_proper_client_transfer_orders_from_shipment_request(Fields) ->
  Default = [ {'orderIds', list(integer(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

