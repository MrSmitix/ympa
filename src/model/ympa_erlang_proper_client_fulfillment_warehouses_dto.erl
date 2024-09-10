-module(ympa_erlang_proper_client_fulfillment_warehouses_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_fulfillment_warehouses_dto/0]).

-export([ympa_erlang_proper_client_fulfillment_warehouses_dto/1]).

-export_type([ympa_erlang_proper_client_fulfillment_warehouses_dto/0]).

-type ympa_erlang_proper_client_fulfillment_warehouses_dto() ::
  [ {'warehouses', list(ympa_erlang_proper_client_fulfillment_warehouse_dto:ympa_erlang_proper_client_fulfillment_warehouse_dto()) }
  ].


ympa_erlang_proper_client_fulfillment_warehouses_dto() ->
    ympa_erlang_proper_client_fulfillment_warehouses_dto([]).

ympa_erlang_proper_client_fulfillment_warehouses_dto(Fields) ->
  Default = [ {'warehouses', list(ympa_erlang_proper_client_fulfillment_warehouse_dto:ympa_erlang_proper_client_fulfillment_warehouse_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

