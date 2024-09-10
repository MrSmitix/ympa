-module(ympa_erlang_proper_client_offer_content_error_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_content_error_type/0]).

-export_type([ympa_erlang_proper_client_offer_content_error_type/0]).

-type ympa_erlang_proper_client_offer_content_error_type() ::
  binary().

ympa_erlang_proper_client_offer_content_error_type() ->
  elements([<<"OFFER_NOT_FOUND">>, <<"UNKNOWN_CATEGORY">>, <<"CATEGORY_MISMATCH">>, <<"UNKNOWN_PARAMETER">>, <<"UNEXPECTED_BOOLEAN_VALUE">>, <<"NUMBER_FORMAT">>, <<"VALUE_BLANK">>, <<"INVALID_UNIT_ID">>, <<"INVALID_GROUP_ID_LENGTH">>, <<"INVALID_GROUP_ID_CHARACTERS">>]).

