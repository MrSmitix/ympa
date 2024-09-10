-module(ympa_erlang_proper_client_generate_united_marketplace_services_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_united_marketplace_services_report_request/0]).

-export([ympa_erlang_proper_client_generate_united_marketplace_services_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_united_marketplace_services_report_request/0]).

-type ympa_erlang_proper_client_generate_united_marketplace_services_report_request() ::
  [ {'businessId', integer() }
  | {'dateTimeFrom', datetime() }
  | {'dateTimeTo', datetime() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  | {'yearFrom', integer() }
  | {'monthFrom', integer() }
  | {'yearTo', integer() }
  | {'monthTo', integer() }
  | {'placementPrograms', list(ympa_erlang_proper_client_placement_type:ympa_erlang_proper_client_placement_type()) }
  | {'inns', list(binary()) }
  | {'campaignIds', list(integer()) }
  ].


ympa_erlang_proper_client_generate_united_marketplace_services_report_request() ->
    ympa_erlang_proper_client_generate_united_marketplace_services_report_request([]).

ympa_erlang_proper_client_generate_united_marketplace_services_report_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'dateTimeFrom', datetime() }
            , {'dateTimeTo', datetime() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            , {'yearFrom', integer() }
            , {'monthFrom', integer(1, 12) }
            , {'yearTo', integer() }
            , {'monthTo', integer(1, 12) }
            , {'placementPrograms', list(ympa_erlang_proper_client_placement_type:ympa_erlang_proper_client_placement_type()) }
            , {'inns', list(binary()) }
            , {'campaignIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

