-module(ympa_erlang_proper_client_feed_index_logs_error_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_index_logs_error_type/0]).

-export_type([ympa_erlang_proper_client_feed_index_logs_error_type/0]).

-type ympa_erlang_proper_client_feed_index_logs_error_type() ::
  binary().

ympa_erlang_proper_client_feed_index_logs_error_type() ->
  elements([<<"DOWNLOAD_ERROR">>, <<"DOWNLOAD_HTTP_ERROR">>, <<"PARSE_ERROR">>, <<"PARSE_XML_ERROR">>, <<"TOO_MANY_REJECTED_OFFERS">>, <<"NOT_INDEXED">>]).

