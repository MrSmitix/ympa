-module(ympa_erlang_proper_client_get_feeds_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_feeds_response/0]).

-export([ympa_erlang_proper_client_get_feeds_response/1]).

-export_type([ympa_erlang_proper_client_get_feeds_response/0]).

-type ympa_erlang_proper_client_get_feeds_response() ::
  [ {'feeds', list(ympa_erlang_proper_client_feed_dto:ympa_erlang_proper_client_feed_dto()) }
  ].


ympa_erlang_proper_client_get_feeds_response() ->
    ympa_erlang_proper_client_get_feeds_response([]).

ympa_erlang_proper_client_get_feeds_response(Fields) ->
  Default = [ {'feeds', list(ympa_erlang_proper_client_feed_dto:ympa_erlang_proper_client_feed_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

