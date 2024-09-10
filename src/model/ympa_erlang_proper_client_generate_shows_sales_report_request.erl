-module(ympa_erlang_proper_client_generate_shows_sales_report_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_shows_sales_report_request/0]).

-export([ympa_erlang_proper_client_generate_shows_sales_report_request/1]).

-export_type([ympa_erlang_proper_client_generate_shows_sales_report_request/0]).

-type ympa_erlang_proper_client_generate_shows_sales_report_request() ::
  [ {'businessId', integer() }
  | {'campaignId', integer() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  | {'grouping', ympa_erlang_proper_client_shows_sales_grouping_type:ympa_erlang_proper_client_shows_sales_grouping_type() }
  ].


ympa_erlang_proper_client_generate_shows_sales_report_request() ->
    ympa_erlang_proper_client_generate_shows_sales_report_request([]).

ympa_erlang_proper_client_generate_shows_sales_report_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'campaignId', integer() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            , {'grouping', ympa_erlang_proper_client_shows_sales_grouping_type:ympa_erlang_proper_client_shows_sales_grouping_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

