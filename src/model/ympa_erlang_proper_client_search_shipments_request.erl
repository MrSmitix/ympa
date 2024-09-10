-module(ympa_erlang_proper_client_search_shipments_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_search_shipments_request/0]).

-export([ympa_erlang_proper_client_search_shipments_request/1]).

-export_type([ympa_erlang_proper_client_search_shipments_request/0]).

-type ympa_erlang_proper_client_search_shipments_request() ::
  [ {'dateFrom', date() }
  | {'dateTo', date() }
  | {'statuses', list(ympa_erlang_proper_client_shipment_status_type:ympa_erlang_proper_client_shipment_status_type()) }
  | {'orderIds', list(integer()) }
  | {'cancelledOrders', boolean() }
  ].


ympa_erlang_proper_client_search_shipments_request() ->
    ympa_erlang_proper_client_search_shipments_request([]).

ympa_erlang_proper_client_search_shipments_request(Fields) ->
  Default = [ {'dateFrom', date() }
            , {'dateTo', date() }
            , {'statuses', list(ympa_erlang_proper_client_shipment_status_type:ympa_erlang_proper_client_shipment_status_type(), 1) }
            , {'orderIds', list(integer(), 1) }
            , {'cancelledOrders', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

