-module(ympa_erlang_proper_client_offer_mapping_error_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_mapping_error_type/0]).

-export_type([ympa_erlang_proper_client_offer_mapping_error_type/0]).

-type ympa_erlang_proper_client_offer_mapping_error_type() ::
  binary().

ympa_erlang_proper_client_offer_mapping_error_type() ->
  elements([<<"UNKNOWN_CATEGORY">>, <<"CATEGORY_MISMATCH">>, <<"EMPTY_MARKET_CATEGORY">>, <<"UNKNOWN_PARAMETER">>, <<"UNEXPECTED_BOOLEAN_VALUE">>, <<"NUMBER_FORMAT">>, <<"VALUE_BLANK">>, <<"INVALID_UNIT_ID">>, <<"INVALID_GROUP_ID_LENGTH">>, <<"INVALID_GROUP_ID_CHARACTERS">>, <<"INVALID_PICKER_URL">>]).

