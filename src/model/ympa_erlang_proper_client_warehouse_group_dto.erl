-module(ympa_erlang_proper_client_warehouse_group_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warehouse_group_dto/0]).

-export([ympa_erlang_proper_client_warehouse_group_dto/1]).

-export_type([ympa_erlang_proper_client_warehouse_group_dto/0]).

-type ympa_erlang_proper_client_warehouse_group_dto() ::
  [ {'name', binary() }
  | {'mainWarehouse', ympa_erlang_proper_client_warehouse_dto:ympa_erlang_proper_client_warehouse_dto() }
  | {'warehouses', list(ympa_erlang_proper_client_warehouse_dto:ympa_erlang_proper_client_warehouse_dto()) }
  ].


ympa_erlang_proper_client_warehouse_group_dto() ->
    ympa_erlang_proper_client_warehouse_group_dto([]).

ympa_erlang_proper_client_warehouse_group_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'mainWarehouse', ympa_erlang_proper_client_warehouse_dto:ympa_erlang_proper_client_warehouse_dto() }
            , {'warehouses', list(ympa_erlang_proper_client_warehouse_dto:ympa_erlang_proper_client_warehouse_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

