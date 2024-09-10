-module(ympa_erlang_proper_client_calculated_tariff_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculated_tariff_type/0]).

-export_type([ympa_erlang_proper_client_calculated_tariff_type/0]).

-type ympa_erlang_proper_client_calculated_tariff_type() ::
  binary().

ympa_erlang_proper_client_calculated_tariff_type() ->
  elements([<<"AGENCY_COMMISSION">>, <<"PAYMENT_TRANSFER">>, <<"FEE">>, <<"DELIVERY_TO_CUSTOMER">>, <<"CROSSREGIONAL_DELIVERY">>, <<"EXPRESS_DELIVERY">>, <<"SORTING">>, <<"MIDDLE_MILE">>]).

