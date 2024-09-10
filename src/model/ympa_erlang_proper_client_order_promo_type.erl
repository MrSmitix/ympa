-module(ympa_erlang_proper_client_order_promo_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_promo_type/0]).

-export_type([ympa_erlang_proper_client_order_promo_type/0]).

-type ympa_erlang_proper_client_order_promo_type() ::
  binary().

ympa_erlang_proper_client_order_promo_type() ->
  elements([<<"DIRECT_DISCOUNT">>, <<"BLUE_SET">>, <<"BLUE_FLASH">>, <<"GENERIC_BUNDLE">>, <<"MARKET_COUPON">>, <<"MARKET_PROMOCODE">>, <<"MARKET_DEAL">>, <<"MARKET_BLUE">>, <<"MARKET_PRIME">>, <<"YANDEX_PLUS">>, <<"BERU_PLUS">>, <<"MARKET_COIN">>, <<"YANDEX_EMPLOYEE">>, <<"LIMITED_FREE_DELIVERY_PROMO">>, <<"FREE_DELIVERY_THRESHOLD">>, <<"MULTICART_DISCOUNT">>, <<"PRICE_DROP_AS_YOU_SHOP">>, <<"FREE_DELIVERY_FOR_LDI">>, <<"FREE_DELIVERY_FOR_LSC">>, <<"SECRET_SALE">>, <<"FREE_PICKUP">>, <<"CHEAPEST_AS_GIFT">>, <<"CASHBACK">>, <<"SUPPLIER_MULTICART_DISCOUNT">>, <<"SPREAD_DISCOUNT_COUNT">>, <<"SPREAD_DISCOUNT_RECEIPT">>, <<"ANNOUNCEMENT_PROMO">>, <<"DISCOUNT_BY_PAYMENT_TYPE">>, <<"PERCENT_DISCOUNT">>, <<"DCO_EXTRA_DISCOUNT">>, <<"EMPTY_PROMO">>, <<"BLOCKING_PROMO">>, <<"UNKNOWN">>]).

