-module(ympa_erlang_proper_client_tariff_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_tariff_type/0]).

-export_type([ympa_erlang_proper_client_tariff_type/0]).

-type ympa_erlang_proper_client_tariff_type() ::
  binary().

ympa_erlang_proper_client_tariff_type() ->
  elements([<<"AGENCY_COMMISSION">>, <<"PAYMENT_TRANSFER">>, <<"STORAGE">>, <<"WITHDRAW">>, <<"SURPLUS">>, <<"FEE">>, <<"DELIVERY_TO_CUSTOMER">>, <<"CROSSREGIONAL_DELIVERY">>, <<"CROSSREGIONAL_DELIVERY_RETURN">>, <<"DISPOSAL">>, <<"SORTING_CENTER_STORAGE">>, <<"EXPRESS_DELIVERY">>, <<"FF_XDOC_SUPPLY_BOX">>, <<"FF_XDOC_SUPPLY_PALLET">>, <<"SORTING">>, <<"MIDDLE_MILE">>, <<"RETURN_PROCESSING">>, <<"EXPRESS_CANCELLED_BY_PARTNER">>, <<"DELIVERY_TO_CUSTOMER_RETURN">>, <<"CROSSBORDER_DELIVERY">>, <<"INTAKE_SORTING_BULKY_CARGO">>, <<"INTAKE_SORTING_SMALL_GOODS">>, <<"INTAKE_SORTING_DAILY">>, <<"FF_STORAGE_BILLING">>, <<"CANCELLED_ORDER_FEE_QI">>, <<"LATE_ORDER_EXECUTION_FEE_QI">>]).

