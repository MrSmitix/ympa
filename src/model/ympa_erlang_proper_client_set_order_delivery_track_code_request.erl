-module(ympa_erlang_proper_client_set_order_delivery_track_code_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_order_delivery_track_code_request/0]).

-export([ympa_erlang_proper_client_set_order_delivery_track_code_request/1]).

-export_type([ympa_erlang_proper_client_set_order_delivery_track_code_request/0]).

-type ympa_erlang_proper_client_set_order_delivery_track_code_request() ::
  [ {'trackCode', binary() }
  | {'deliveryServiceId', integer() }
  ].


ympa_erlang_proper_client_set_order_delivery_track_code_request() ->
    ympa_erlang_proper_client_set_order_delivery_track_code_request([]).

ympa_erlang_proper_client_set_order_delivery_track_code_request(Fields) ->
  Default = [ {'trackCode', binary() }
            , {'deliveryServiceId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

