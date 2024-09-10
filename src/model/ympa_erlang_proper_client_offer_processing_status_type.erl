-module(ympa_erlang_proper_client_offer_processing_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_processing_status_type/0]).

-export_type([ympa_erlang_proper_client_offer_processing_status_type/0]).

-type ympa_erlang_proper_client_offer_processing_status_type() ::
  binary().

ympa_erlang_proper_client_offer_processing_status_type() ->
  elements([<<"UNKNOWN">>, <<"READY">>, <<"IN_WORK">>, <<"NEED_INFO">>, <<"NEED_MAPPING">>, <<"NEED_CONTENT">>, <<"CONTENT_PROCESSING">>, <<"SUSPENDED">>, <<"REJECTED">>, <<"REVIEW">>, <<"CREATE_ERROR">>, <<"UPDATE_ERROR">>]).

