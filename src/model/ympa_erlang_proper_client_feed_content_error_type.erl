-module(ympa_erlang_proper_client_feed_content_error_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feed_content_error_type/0]).

-export_type([ympa_erlang_proper_client_feed_content_error_type/0]).

-type ympa_erlang_proper_client_feed_content_error_type() ::
  binary().

ympa_erlang_proper_client_feed_content_error_type() ->
  elements([<<"PARSE_ERROR">>, <<"PARSE_XML_ERROR">>, <<"TOO_MANY_REJECTED_OFFERS">>]).

