-module(ympa_erlang_proper_client_get_promos_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promos_request/0]).

-export([ympa_erlang_proper_client_get_promos_request/1]).

-export_type([ympa_erlang_proper_client_get_promos_request/0]).

-type ympa_erlang_proper_client_get_promos_request() ::
  [ {'participation', ympa_erlang_proper_client_promo_participation_type:ympa_erlang_proper_client_promo_participation_type() }
  | {'mechanics', ympa_erlang_proper_client_mechanics_type:ympa_erlang_proper_client_mechanics_type() }
  ].


ympa_erlang_proper_client_get_promos_request() ->
    ympa_erlang_proper_client_get_promos_request([]).

ympa_erlang_proper_client_get_promos_request(Fields) ->
  Default = [ {'participation', ympa_erlang_proper_client_promo_participation_type:ympa_erlang_proper_client_promo_participation_type() }
            , {'mechanics', ympa_erlang_proper_client_mechanics_type:ympa_erlang_proper_client_mechanics_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

