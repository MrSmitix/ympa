-module(ympa_erlang_proper_client_report_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_report_info_dto/0]).

-export([ympa_erlang_proper_client_report_info_dto/1]).

-export_type([ympa_erlang_proper_client_report_info_dto/0]).

-type ympa_erlang_proper_client_report_info_dto() ::
  [ {'status', ympa_erlang_proper_client_report_status_type:ympa_erlang_proper_client_report_status_type() }
  | {'subStatus', ympa_erlang_proper_client_report_sub_status_type:ympa_erlang_proper_client_report_sub_status_type() }
  | {'generationRequestedAt', datetime() }
  | {'generationFinishedAt', datetime() }
  | {'file', binary() }
  | {'estimatedGenerationTime', integer() }
  ].


ympa_erlang_proper_client_report_info_dto() ->
    ympa_erlang_proper_client_report_info_dto([]).

ympa_erlang_proper_client_report_info_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_report_status_type:ympa_erlang_proper_client_report_status_type() }
            , {'subStatus', ympa_erlang_proper_client_report_sub_status_type:ympa_erlang_proper_client_report_sub_status_type() }
            , {'generationRequestedAt', datetime() }
            , {'generationFinishedAt', datetime() }
            , {'file', binary() }
            , {'estimatedGenerationTime', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

