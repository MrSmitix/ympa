-module(ympa_erlang_proper_client_get_quality_rating_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_quality_rating_request/0]).

-export([ympa_erlang_proper_client_get_quality_rating_request/1]).

-export_type([ympa_erlang_proper_client_get_quality_rating_request/0]).

-type ympa_erlang_proper_client_get_quality_rating_request() ::
  [ {'dateFrom', date() }
  | {'dateTo', date() }
  | {'campaignIds', list(integer()) }
  ].


ympa_erlang_proper_client_get_quality_rating_request() ->
    ympa_erlang_proper_client_get_quality_rating_request([]).

ympa_erlang_proper_client_get_quality_rating_request(Fields) ->
  Default = [ {'dateFrom', date() }
            , {'dateTo', date() }
            , {'campaignIds', list(integer(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

