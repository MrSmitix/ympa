-module(ympa_erlang_proper_client_order_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_dto/0]).

-export([ympa_erlang_proper_client_order_item_dto/1]).

-export_type([ympa_erlang_proper_client_order_item_dto/0]).

-type ympa_erlang_proper_client_order_item_dto() ::
  [ {'id', integer() }
  | {'offerId', binary() }
  | {'offerName', binary() }
  | {'price', integer() }
  | {'buyerPrice', integer() }
  | {'buyerPriceBeforeDiscount', integer() }
  | {'priceBeforeDiscount', integer() }
  | {'count', integer() }
  | {'vat', ympa_erlang_proper_client_order_vat_type:ympa_erlang_proper_client_order_vat_type() }
  | {'shopSku', binary() }
  | {'subsidy', integer() }
  | {'partnerWarehouseId', binary() }
  | {'promos', list(ympa_erlang_proper_client_order_item_promo_dto:ympa_erlang_proper_client_order_item_promo_dto()) }
  | {'instances', list(ympa_erlang_proper_client_order_item_instance_dto:ympa_erlang_proper_client_order_item_instance_dto()) }
  | {'details', list(ympa_erlang_proper_client_order_item_detail_dto:ympa_erlang_proper_client_order_item_detail_dto()) }
  | {'subsidies', list(ympa_erlang_proper_client_order_item_subsidy_dto:ympa_erlang_proper_client_order_item_subsidy_dto()) }
  | {'requiredInstanceTypes', list(ympa_erlang_proper_client_order_item_instance_type:ympa_erlang_proper_client_order_item_instance_type()) }
  ].


ympa_erlang_proper_client_order_item_dto() ->
    ympa_erlang_proper_client_order_item_dto([]).

ympa_erlang_proper_client_order_item_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'offerId', binary(1, 255) }
            , {'offerName', binary() }
            , {'price', integer() }
            , {'buyerPrice', integer() }
            , {'buyerPriceBeforeDiscount', integer() }
            , {'priceBeforeDiscount', integer() }
            , {'count', integer() }
            , {'vat', ympa_erlang_proper_client_order_vat_type:ympa_erlang_proper_client_order_vat_type() }
            , {'shopSku', binary(1, 255) }
            , {'subsidy', integer() }
            , {'partnerWarehouseId', binary() }
            , {'promos', list(ympa_erlang_proper_client_order_item_promo_dto:ympa_erlang_proper_client_order_item_promo_dto()) }
            , {'instances', list(ympa_erlang_proper_client_order_item_instance_dto:ympa_erlang_proper_client_order_item_instance_dto()) }
            , {'details', list(ympa_erlang_proper_client_order_item_detail_dto:ympa_erlang_proper_client_order_item_detail_dto()) }
            , {'subsidies', list(ympa_erlang_proper_client_order_item_subsidy_dto:ympa_erlang_proper_client_order_item_subsidy_dto()) }
            , {'requiredInstanceTypes', list(ympa_erlang_proper_client_order_item_instance_type:ympa_erlang_proper_client_order_item_instance_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

