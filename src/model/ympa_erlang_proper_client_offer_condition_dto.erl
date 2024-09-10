-module(ympa_erlang_proper_client_offer_condition_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_condition_dto/0]).

-export([ympa_erlang_proper_client_offer_condition_dto/1]).

-export_type([ympa_erlang_proper_client_offer_condition_dto/0]).

-type ympa_erlang_proper_client_offer_condition_dto() ::
  [ {'type', ympa_erlang_proper_client_offer_condition_type:ympa_erlang_proper_client_offer_condition_type() }
  | {'quality', ympa_erlang_proper_client_offer_condition_quality_type:ympa_erlang_proper_client_offer_condition_quality_type() }
  | {'reason', binary() }
  ].


ympa_erlang_proper_client_offer_condition_dto() ->
    ympa_erlang_proper_client_offer_condition_dto([]).

ympa_erlang_proper_client_offer_condition_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_offer_condition_type:ympa_erlang_proper_client_offer_condition_type() }
            , {'quality', ympa_erlang_proper_client_offer_condition_quality_type:ympa_erlang_proper_client_offer_condition_quality_type() }
            , {'reason', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

