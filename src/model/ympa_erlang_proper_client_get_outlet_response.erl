-module(ympa_erlang_proper_client_get_outlet_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_outlet_response/0]).

-export([ympa_erlang_proper_client_get_outlet_response/1]).

-export_type([ympa_erlang_proper_client_get_outlet_response/0]).

-type ympa_erlang_proper_client_get_outlet_response() ::
  [ {'outlet', ympa_erlang_proper_client_full_outlet_dto:ympa_erlang_proper_client_full_outlet_dto() }
  ].


ympa_erlang_proper_client_get_outlet_response() ->
    ympa_erlang_proper_client_get_outlet_response([]).

ympa_erlang_proper_client_get_outlet_response(Fields) ->
  Default = [ {'outlet', ympa_erlang_proper_client_full_outlet_dto:ympa_erlang_proper_client_full_outlet_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

