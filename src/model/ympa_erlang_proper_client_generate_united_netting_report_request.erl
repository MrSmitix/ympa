-module(ympa_erlang_proper_client_generate_united_netting_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_united_netting_report_request/0]).

-export([ympa_erlang_proper_client_generate_united_netting_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_united_netting_report_request/0]).

-type ympa_erlang_proper_client_generate_united_netting_report_request() ::
  [ {'businessId', integer() }
  | {'dateTimeFrom', datetime() }
  | {'dateTimeTo', datetime() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  | {'bankOrderId', integer() }
  | {'bankOrderDateTime', datetime() }
  | {'placementPrograms', list(ympa_erlang_proper_client_placement_type:ympa_erlang_proper_client_placement_type()) }
  | {'inns', list(binary()) }
  | {'campaignIds', list(integer()) }
  ].


ympa_erlang_proper_client_generate_united_netting_report_request() ->
    ympa_erlang_proper_client_generate_united_netting_report_request([]).

ympa_erlang_proper_client_generate_united_netting_report_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'dateTimeFrom', datetime() }
            , {'dateTimeTo', datetime() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            , {'bankOrderId', integer() }
            , {'bankOrderDateTime', datetime() }
            , {'placementPrograms', list(ympa_erlang_proper_client_placement_type:ympa_erlang_proper_client_placement_type()) }
            , {'inns', list(binary()) }
            , {'campaignIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

