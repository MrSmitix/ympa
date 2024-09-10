-module(ympa_erlang_proper_client_feed_index_logs_record_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_index_logs_record_dto/0]).

-export([ympa_erlang_proper_client_feed_index_logs_record_dto/1]).

-export_type([ympa_erlang_proper_client_feed_index_logs_record_dto/0]).

-type ympa_erlang_proper_client_feed_index_logs_record_dto() ::
  [ {'downloadTime', datetime() }
  | {'fileTime', datetime() }
  | {'generationId', integer() }
  | {'indexType', ympa_erlang_proper_client_feed_index_logs_index_type:ympa_erlang_proper_client_feed_index_logs_index_type() }
  | {'publishedTime', datetime() }
  | {'status', ympa_erlang_proper_client_feed_index_logs_status_type:ympa_erlang_proper_client_feed_index_logs_status_type() }
  | {'error', ympa_erlang_proper_client_feed_index_logs_error_dto:ympa_erlang_proper_client_feed_index_logs_error_dto() }
  | {'offers', ympa_erlang_proper_client_feed_index_logs_offers_dto:ympa_erlang_proper_client_feed_index_logs_offers_dto() }
  ].


ympa_erlang_proper_client_feed_index_logs_record_dto() ->
    ympa_erlang_proper_client_feed_index_logs_record_dto([]).

ympa_erlang_proper_client_feed_index_logs_record_dto(Fields) ->
  Default = [ {'downloadTime', datetime() }
            , {'fileTime', datetime() }
            , {'generationId', integer() }
            , {'indexType', ympa_erlang_proper_client_feed_index_logs_index_type:ympa_erlang_proper_client_feed_index_logs_index_type() }
            , {'publishedTime', datetime() }
            , {'status', ympa_erlang_proper_client_feed_index_logs_status_type:ympa_erlang_proper_client_feed_index_logs_status_type() }
            , {'error', ympa_erlang_proper_client_feed_index_logs_error_dto:ympa_erlang_proper_client_feed_index_logs_error_dto() }
            , {'offers', ympa_erlang_proper_client_feed_index_logs_offers_dto:ympa_erlang_proper_client_feed_index_logs_offers_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

