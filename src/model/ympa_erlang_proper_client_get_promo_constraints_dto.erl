-module(ympa_erlang_proper_client_get_promo_constraints_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promo_constraints_dto/0]).

-export([ympa_erlang_proper_client_get_promo_constraints_dto/1]).

-export_type([ympa_erlang_proper_client_get_promo_constraints_dto/0]).

-type ympa_erlang_proper_client_get_promo_constraints_dto() ::
  [ {'warehouseIds', list(integer()) }
  ].


ympa_erlang_proper_client_get_promo_constraints_dto() ->
    ympa_erlang_proper_client_get_promo_constraints_dto([]).

ympa_erlang_proper_client_get_promo_constraints_dto(Fields) ->
  Default = [ {'warehouseIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

