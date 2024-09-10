-module(ympa_erlang_proper_client_promo_offer_update_warning_code_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_offer_update_warning_code_type/0]).

-export_type([ympa_erlang_proper_client_promo_offer_update_warning_code_type/0]).

-type ympa_erlang_proper_client_promo_offer_update_warning_code_type() ::
  binary().

ympa_erlang_proper_client_promo_offer_update_warning_code_type() ->
  elements([<<"DEEP_DISCOUNT_OFFER">>, <<"CATALOG_PRICE_IS_LOWER_THAN_PROMO">>, <<"SHOP_PRICES_ARE_LOWER_THAN_PROMO">>, <<"PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE">>, <<"SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO">>]).

