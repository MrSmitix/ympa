-module(ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto/0]).

-export([ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto/1]).

-export_type([ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto/0]).

-type ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto() ::
  [ {'name', ympa_erlang_proper_client_price_quarantine_verdict_param_name_type:ympa_erlang_proper_client_price_quarantine_verdict_param_name_type() }
  | {'value', binary() }
  ].


ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto() ->
    ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto([]).

ympa_erlang_proper_client_price_quarantine_verdict_parameter_dto(Fields) ->
  Default = [ {'name', ympa_erlang_proper_client_price_quarantine_verdict_param_name_type:ympa_erlang_proper_client_price_quarantine_verdict_param_name_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

