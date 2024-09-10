-module(ympa_erlang_proper_client_orders_stats_commission_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_commission_type/0]).

-export_type([ympa_erlang_proper_client_orders_stats_commission_type/0]).

-type ympa_erlang_proper_client_orders_stats_commission_type() ::
  binary().

ympa_erlang_proper_client_orders_stats_commission_type() ->
  elements([<<"FEE">>, <<"FULFILLMENT">>, <<"LOYALTY_PARTICIPATION_FEE">>, <<"AUCTION_PROMOTION">>, <<"INSTALLMENT">>, <<"DELIVERY_TO_CUSTOMER">>, <<"EXPRESS_DELIVERY_TO_CUSTOMER">>, <<"AGENCY">>, <<"PAYMENT_TRANSFER">>, <<"RETURNED_ORDERS_STORAGE">>, <<"SORTING">>, <<"INTAKE_SORTING">>, <<"RETURN_PROCESSING">>, <<"ILLIQUID_GOODS_SALE">>]).

