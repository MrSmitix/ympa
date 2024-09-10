-module(ympa_erlang_proper_client_feed_index_logs_index_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_index_logs_index_type/0]).

-export_type([ympa_erlang_proper_client_feed_index_logs_index_type/0]).

-type ympa_erlang_proper_client_feed_index_logs_index_type() ::
  binary().

ympa_erlang_proper_client_feed_index_logs_index_type() ->
  elements([<<"DIFF">>, <<"FAST_PRICE">>, <<"FULL">>]).

