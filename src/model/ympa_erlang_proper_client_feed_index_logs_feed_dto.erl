-module(ympa_erlang_proper_client_feed_index_logs_feed_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_index_logs_feed_dto/0]).

-export([ympa_erlang_proper_client_feed_index_logs_feed_dto/1]).

-export_type([ympa_erlang_proper_client_feed_index_logs_feed_dto/0]).

-type ympa_erlang_proper_client_feed_index_logs_feed_dto() ::
  [ {'id', integer() }
  ].


ympa_erlang_proper_client_feed_index_logs_feed_dto() ->
    ympa_erlang_proper_client_feed_index_logs_feed_dto([]).

ympa_erlang_proper_client_feed_index_logs_feed_dto(Fields) ->
  Default = [ {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

