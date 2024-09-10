-module(ympa_erlang_proper_client_price_quarantine_verdict_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_quarantine_verdict_dto/0]).

-export([ympa_erlang_proper_client_price_quarantine_verdict_dto/1]).

-export_type([ympa_erlang_proper_client_price_quarantine_verdict_dto/0]).

-type ympa_erlang_proper_client_price_quarantine_verdict_dto() ::
  [ {'type', ympa_erlang_proper_client_price_quarantine_verdict_type:ympa_erlang_proper_client_price_quarantine_verdict_type() }
  | {'params', list(ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto:ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto()) }
  ].


ympa_erlang_proper_client_price_quarantine_verdict_dto() ->
    ympa_erlang_proper_client_price_quarantine_verdict_dto([]).

ympa_erlang_proper_client_price_quarantine_verdict_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_price_quarantine_verdict_type:ympa_erlang_proper_client_price_quarantine_verdict_type() }
            , {'params', list(ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto:ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

