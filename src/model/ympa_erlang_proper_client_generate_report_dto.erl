-module(ympa_erlang_proper_client_generate_report_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_report_dto/0]).

-export([ympa_erlang_proper_client_generate_report_dto/1]).

-export_type([ympa_erlang_proper_client_generate_report_dto/0]).

-type ympa_erlang_proper_client_generate_report_dto() ::
  [ {'reportId', binary() }
  | {'estimatedGenerationTime', integer() }
  ].


ympa_erlang_proper_client_generate_report_dto() ->
    ympa_erlang_proper_client_generate_report_dto([]).

ympa_erlang_proper_client_generate_report_dto(Fields) ->
  Default = [ {'reportId', binary() }
            , {'estimatedGenerationTime', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

