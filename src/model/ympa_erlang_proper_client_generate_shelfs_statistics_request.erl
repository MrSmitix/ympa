-module(ympa_erlang_proper_client_generate_shelfs_statistics_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_shelfs_statistics_request/0]).

-export([ympa_erlang_proper_client_generate_shelfs_statistics_request/1]).

-export_type([ympa_erlang_proper_client_generate_shelfs_statistics_request/0]).

-type ympa_erlang_proper_client_generate_shelfs_statistics_request() ::
  [ {'businessId', integer() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  | {'attributionType', ympa_erlang_proper_client_shelfs_statistics_attribution_type:ympa_erlang_proper_client_shelfs_statistics_attribution_type() }
  ].


ympa_erlang_proper_client_generate_shelfs_statistics_request() ->
    ympa_erlang_proper_client_generate_shelfs_statistics_request([]).

ympa_erlang_proper_client_generate_shelfs_statistics_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            , {'attributionType', ympa_erlang_proper_client_shelfs_statistics_attribution_type:ympa_erlang_proper_client_shelfs_statistics_attribution_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

