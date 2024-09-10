-module(ympa_erlang_proper_client_order_payment_method_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_payment_method_type/0]).

-export_type([ympa_erlang_proper_client_order_payment_method_type/0]).

-type ympa_erlang_proper_client_order_payment_method_type() ::
  binary().

ympa_erlang_proper_client_order_payment_method_type() ->
  elements([<<"CASH_ON_DELIVERY">>, <<"CARD_ON_DELIVERY">>, <<"BOUND_CARD_ON_DELIVERY">>, <<"YANDEX">>, <<"APPLE_PAY">>, <<"EXTERNAL_CERTIFICATE">>, <<"CREDIT">>, <<"GOOGLE_PAY">>, <<"TINKOFF_CREDIT">>, <<"SBP">>, <<"TINKOFF_INSTALLMENTS">>, <<"B2B_ACCOUNT_PREPAYMENT">>, <<"B2B_ACCOUNT_POSTPAYMENT">>, <<"UNKNOWN">>]).

