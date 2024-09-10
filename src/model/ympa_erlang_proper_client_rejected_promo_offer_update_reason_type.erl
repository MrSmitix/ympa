-module(ympa_erlang_proper_client_rejected_promo_offer_update_reason_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_rejected_promo_offer_update_reason_type/0]).

-export_type([ympa_erlang_proper_client_rejected_promo_offer_update_reason_type/0]).

-type ympa_erlang_proper_client_rejected_promo_offer_update_reason_type() ::
  binary().

ympa_erlang_proper_client_rejected_promo_offer_update_reason_type() ->
  elements([<<"OFFER_DOES_NOT_EXIST">>, <<"OFFER_DUPLICATION">>, <<"OFFER_NOT_ELIGIBLE_FOR_PROMO">>, <<"OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED">>, <<"DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED">>, <<"EMPTY_OLD_PRICE">>, <<"EMPTY_PROMO_PRICE">>, <<"MAX_PROMO_PRICE_EXCEEDED">>, <<"PROMO_PRICE_BIGGER_THAN_MAX">>, <<"PROMO_PRICE_SMALLER_THAN_MIN">>]).

