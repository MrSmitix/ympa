-module(ympa_erlang_proper_client_warehouse_address_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warehouse_address_dto/0]).

-export([ympa_erlang_proper_client_warehouse_address_dto/1]).

-export_type([ympa_erlang_proper_client_warehouse_address_dto/0]).

-type ympa_erlang_proper_client_warehouse_address_dto() ::
  [ {'city', binary() }
  | {'street', binary() }
  | {'number', binary() }
  | {'building', binary() }
  | {'block', binary() }
  | {'gps', ympa_erlang_proper_client_gps_dto:ympa_erlang_proper_client_gps_dto() }
  ].


ympa_erlang_proper_client_warehouse_address_dto() ->
    ympa_erlang_proper_client_warehouse_address_dto([]).

ympa_erlang_proper_client_warehouse_address_dto(Fields) ->
  Default = [ {'city', binary() }
            , {'street', binary() }
            , {'number', binary() }
            , {'building', binary() }
            , {'block', binary() }
            , {'gps', ympa_erlang_proper_client_gps_dto:ympa_erlang_proper_client_gps_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

