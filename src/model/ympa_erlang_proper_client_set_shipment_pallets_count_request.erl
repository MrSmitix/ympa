-module(ympa_erlang_proper_client_set_shipment_pallets_count_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_shipment_pallets_count_request/0]).

-export([ympa_erlang_proper_client_set_shipment_pallets_count_request/1]).

-export_type([ympa_erlang_proper_client_set_shipment_pallets_count_request/0]).

-type ympa_erlang_proper_client_set_shipment_pallets_count_request() ::
  [ {'placesCount', integer() }
  ].


ympa_erlang_proper_client_set_shipment_pallets_count_request() ->
    ympa_erlang_proper_client_set_shipment_pallets_count_request([]).

ympa_erlang_proper_client_set_shipment_pallets_count_request(Fields) ->
  Default = [ {'placesCount', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

