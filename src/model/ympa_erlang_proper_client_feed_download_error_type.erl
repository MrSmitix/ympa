-module(ympa_erlang_proper_client_feed_download_error_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_download_error_type/0]).

-export_type([ympa_erlang_proper_client_feed_download_error_type/0]).

-type ympa_erlang_proper_client_feed_download_error_type() ::
  binary().

ympa_erlang_proper_client_feed_download_error_type() ->
  elements([<<"DOWNLOAD_ERROR">>, <<"DOWNLOAD_HTTP_ERROR">>]).

