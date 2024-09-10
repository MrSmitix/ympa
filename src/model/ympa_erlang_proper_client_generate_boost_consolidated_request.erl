-module(ympa_erlang_proper_client_generate_boost_consolidated_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_boost_consolidated_request/0]).

-export([ympa_erlang_proper_client_generate_boost_consolidated_request/1]).

-export_type([ympa_erlang_proper_client_generate_boost_consolidated_request/0]).

-type ympa_erlang_proper_client_generate_boost_consolidated_request() ::
  [ {'businessId', integer() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  ].


ympa_erlang_proper_client_generate_boost_consolidated_request() ->
    ympa_erlang_proper_client_generate_boost_consolidated_request([]).

ympa_erlang_proper_client_generate_boost_consolidated_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

