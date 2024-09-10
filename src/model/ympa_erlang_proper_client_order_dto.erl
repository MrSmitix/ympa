-module(ympa_erlang_proper_client_order_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_dto/0]).

-export([ympa_erlang_proper_client_order_dto/1]).

-export_type([ympa_erlang_proper_client_order_dto/0]).

-type ympa_erlang_proper_client_order_dto() ::
  [ {'id', integer() }
  | {'status', ympa_erlang_proper_client_order_status_type:ympa_erlang_proper_client_order_status_type() }
  | {'substatus', ympa_erlang_proper_client_order_substatus_type:ympa_erlang_proper_client_order_substatus_type() }
  | {'creationDate', binary() }
  | {'updatedAt', binary() }
  | {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'itemsTotal', integer() }
  | {'deliveryTotal', integer() }
  | {'buyerItemsTotal', integer() }
  | {'buyerTotal', integer() }
  | {'buyerItemsTotalBeforeDiscount', integer() }
  | {'buyerTotalBeforeDiscount', integer() }
  | {'paymentType', ympa_erlang_proper_client_order_payment_type:ympa_erlang_proper_client_order_payment_type() }
  | {'paymentMethod', ympa_erlang_proper_client_order_payment_method_type:ympa_erlang_proper_client_order_payment_method_type() }
  | {'fake', boolean() }
  | {'items', list(ympa_erlang_proper_client_order_item_dto:ympa_erlang_proper_client_order_item_dto()) }
  | {'subsidies', list(ympa_erlang_proper_client_order_subsidy_dto:ympa_erlang_proper_client_order_subsidy_dto()) }
  | {'delivery', ympa_erlang_proper_client_order_delivery_dto:ympa_erlang_proper_client_order_delivery_dto() }
  | {'buyer', ympa_erlang_proper_client_order_buyer_dto:ympa_erlang_proper_client_order_buyer_dto() }
  | {'notes', binary() }
  | {'taxSystem', ympa_erlang_proper_client_order_tax_system_type:ympa_erlang_proper_client_order_tax_system_type() }
  | {'cancelRequested', boolean() }
  | {'expiryDate', binary() }
  ].


ympa_erlang_proper_client_order_dto() ->
    ympa_erlang_proper_client_order_dto([]).

ympa_erlang_proper_client_order_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'status', ympa_erlang_proper_client_order_status_type:ympa_erlang_proper_client_order_status_type() }
            , {'substatus', ympa_erlang_proper_client_order_substatus_type:ympa_erlang_proper_client_order_substatus_type() }
            , {'creationDate', binary() }
            , {'updatedAt', binary() }
            , {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'itemsTotal', integer() }
            , {'deliveryTotal', integer() }
            , {'buyerItemsTotal', integer() }
            , {'buyerTotal', integer() }
            , {'buyerItemsTotalBeforeDiscount', integer() }
            , {'buyerTotalBeforeDiscount', integer() }
            , {'paymentType', ympa_erlang_proper_client_order_payment_type:ympa_erlang_proper_client_order_payment_type() }
            , {'paymentMethod', ympa_erlang_proper_client_order_payment_method_type:ympa_erlang_proper_client_order_payment_method_type() }
            , {'fake', boolean() }
            , {'items', list(ympa_erlang_proper_client_order_item_dto:ympa_erlang_proper_client_order_item_dto()) }
            , {'subsidies', list(ympa_erlang_proper_client_order_subsidy_dto:ympa_erlang_proper_client_order_subsidy_dto()) }
            , {'delivery', ympa_erlang_proper_client_order_delivery_dto:ympa_erlang_proper_client_order_delivery_dto() }
            , {'buyer', ympa_erlang_proper_client_order_buyer_dto:ympa_erlang_proper_client_order_buyer_dto() }
            , {'notes', binary() }
            , {'taxSystem', ympa_erlang_proper_client_order_tax_system_type:ympa_erlang_proper_client_order_tax_system_type() }
            , {'cancelRequested', boolean() }
            , {'expiryDate', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

