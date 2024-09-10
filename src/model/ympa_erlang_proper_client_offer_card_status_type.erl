-module(ympa_erlang_proper_client_offer_card_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_card_status_type/0]).

-export_type([ympa_erlang_proper_client_offer_card_status_type/0]).

-type ympa_erlang_proper_client_offer_card_status_type() ::
  binary().

ympa_erlang_proper_client_offer_card_status_type() ->
  elements([<<"HAS_CARD_CAN_NOT_UPDATE">>, <<"HAS_CARD_CAN_UPDATE">>, <<"HAS_CARD_CAN_UPDATE_ERRORS">>, <<"HAS_CARD_CAN_UPDATE_PROCESSING">>, <<"NO_CARD_NEED_CONTENT">>, <<"NO_CARD_MARKET_WILL_CREATE">>, <<"NO_CARD_ERRORS">>, <<"NO_CARD_PROCESSING">>, <<"NO_CARD_ADD_TO_CAMPAIGN">>]).

