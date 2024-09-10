-module(ympa_erlang_proper_client_promo_period_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_period_dto/0]).

-export([ympa_erlang_proper_client_promo_period_dto/1]).

-export_type([ympa_erlang_proper_client_promo_period_dto/0]).

-type ympa_erlang_proper_client_promo_period_dto() ::
  [ {'dateTimeFrom', datetime() }
  | {'dateTimeTo', datetime() }
  ].


ympa_erlang_proper_client_promo_period_dto() ->
    ympa_erlang_proper_client_promo_period_dto([]).

ympa_erlang_proper_client_promo_period_dto(Fields) ->
  Default = [ {'dateTimeFrom', datetime() }
            , {'dateTimeTo', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

