-module(ympa_erlang_proper_client_feed_index_logs_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_index_logs_result_dto/0]).

-export([ympa_erlang_proper_client_feed_index_logs_result_dto/1]).

-export_type([ympa_erlang_proper_client_feed_index_logs_result_dto/0]).

-type ympa_erlang_proper_client_feed_index_logs_result_dto() ::
  [ {'feed', ympa_erlang_proper_client_feed_index_logs_feed_dto:ympa_erlang_proper_client_feed_index_logs_feed_dto() }
  | {'indexLogRecords', list(ympa_erlang_proper_client_feed_index_logs_record_dto:ympa_erlang_proper_client_feed_index_logs_record_dto()) }
  | {'total', integer() }
  ].


ympa_erlang_proper_client_feed_index_logs_result_dto() ->
    ympa_erlang_proper_client_feed_index_logs_result_dto([]).

ympa_erlang_proper_client_feed_index_logs_result_dto(Fields) ->
  Default = [ {'feed', ympa_erlang_proper_client_feed_index_logs_feed_dto:ympa_erlang_proper_client_feed_index_logs_feed_dto() }
            , {'indexLogRecords', list(ympa_erlang_proper_client_feed_index_logs_record_dto:ympa_erlang_proper_client_feed_index_logs_record_dto()) }
            , {'total', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

