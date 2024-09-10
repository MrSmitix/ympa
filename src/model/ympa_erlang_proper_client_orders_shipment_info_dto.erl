-module(ympa_erlang_proper_client_orders_shipment_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_shipment_info_dto/0]).

-export([ympa_erlang_proper_client_orders_shipment_info_dto/1]).

-export_type([ympa_erlang_proper_client_orders_shipment_info_dto/0]).

-type ympa_erlang_proper_client_orders_shipment_info_dto() ::
  [ {'orderIdsWithLabels', list(integer()) }
  | {'orderIdsWithoutLabels', list(integer()) }
  ].


ympa_erlang_proper_client_orders_shipment_info_dto() ->
    ympa_erlang_proper_client_orders_shipment_info_dto([]).

ympa_erlang_proper_client_orders_shipment_info_dto(Fields) ->
  Default = [ {'orderIdsWithLabels', list(integer()) }
            , {'orderIdsWithoutLabels', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

