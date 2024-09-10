-module(ympa_erlang_proper_client_generate_competitors_position_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_competitors_position_report_request/0]).

-export([ympa_erlang_proper_client_generate_competitors_position_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_competitors_position_report_request/0]).

-type ympa_erlang_proper_client_generate_competitors_position_report_request() ::
  [ {'businessId', integer() }
  | {'categoryId', integer() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  ].


ympa_erlang_proper_client_generate_competitors_position_report_request() ->
    ympa_erlang_proper_client_generate_competitors_position_report_request([]).

ympa_erlang_proper_client_generate_competitors_position_report_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'categoryId', integer() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

