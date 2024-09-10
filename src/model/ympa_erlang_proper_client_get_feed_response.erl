-module(ympa_erlang_proper_client_get_feed_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_feed_response/0]).

-export([ympa_erlang_proper_client_get_feed_response/1]).

-export_type([ympa_erlang_proper_client_get_feed_response/0]).

-type ympa_erlang_proper_client_get_feed_response() ::
  [ {'feed', ympa_erlang_proper_client_feed_dto:ympa_erlang_proper_client_feed_dto() }
  ].


ympa_erlang_proper_client_get_feed_response() ->
    ympa_erlang_proper_client_get_feed_response([]).

ympa_erlang_proper_client_get_feed_response(Fields) ->
  Default = [ {'feed', ympa_erlang_proper_client_feed_dto:ympa_erlang_proper_client_feed_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

