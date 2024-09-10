-module(ympa_erlang_proper_client_offer_param_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_param_dto/0]).

-export([ympa_erlang_proper_client_offer_param_dto/1]).

-export_type([ympa_erlang_proper_client_offer_param_dto/0]).

-type ympa_erlang_proper_client_offer_param_dto() ::
  [ {'name', binary() }
  | {'value', binary() }
  ].


ympa_erlang_proper_client_offer_param_dto() ->
    ympa_erlang_proper_client_offer_param_dto([]).

ympa_erlang_proper_client_offer_param_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

