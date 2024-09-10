-module(ympa_erlang_proper_client_update_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_offer_dto/0]).

-export([ympa_erlang_proper_client_update_offer_dto/1]).

-export_type([ympa_erlang_proper_client_update_offer_dto/0]).

-type ympa_erlang_proper_client_update_offer_dto() ::
  [ {'offerId', binary() }
  | {'name', binary() }
  | {'marketCategoryId', integer() }
  | {'category', binary() }
  | {'pictures', list(binary()) }
  | {'videos', list(binary()) }
  | {'manuals', list(ympa_erlang_proper_client_offer_manual_dto:ympa_erlang_proper_client_offer_manual_dto()) }
  | {'vendor', binary() }
  | {'barcodes', list(binary()) }
  | {'description', binary() }
  | {'manufacturerCountries', list(binary()) }
  | {'weightDimensions', ympa_erlang_proper_client_offer_weight_dimensions_dto:ympa_erlang_proper_client_offer_weight_dimensions_dto() }
  | {'vendorCode', binary() }
  | {'tags', list(binary()) }
  | {'shelfLife', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
  | {'lifeTime', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
  | {'guaranteePeriod', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
  | {'customsCommodityCode', binary() }
  | {'certificates', list(binary()) }
  | {'boxCount', integer() }
  | {'condition', ympa_erlang_proper_client_offer_condition_dto:ympa_erlang_proper_client_offer_condition_dto() }
  | {'type', ympa_erlang_proper_client_offer_type:ympa_erlang_proper_client_offer_type() }
  | {'downloadable', boolean() }
  | {'adult', boolean() }
  | {'age', ympa_erlang_proper_client_age_dto:ympa_erlang_proper_client_age_dto() }
  | {'params', list(ympa_erlang_proper_client_offer_param_dto:ympa_erlang_proper_client_offer_param_dto()) }
  | {'parameterValues', list(ympa_erlang_proper_client_parameter_value_dto:ympa_erlang_proper_client_parameter_value_dto()) }
  | {'basicPrice', ympa_erlang_proper_client_update_price_with_discount_dto:ympa_erlang_proper_client_update_price_with_discount_dto() }
  | {'purchasePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'additionalExpenses', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'cofinancePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  ].


ympa_erlang_proper_client_update_offer_dto() ->
    ympa_erlang_proper_client_update_offer_dto([]).

ympa_erlang_proper_client_update_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'name', binary() }
            , {'marketCategoryId', integer() }
            , {'category', binary() }
            , {'pictures', list(binary()) }
            , {'videos', list(binary()) }
            , {'manuals', list(ympa_erlang_proper_client_offer_manual_dto:ympa_erlang_proper_client_offer_manual_dto()) }
            , {'vendor', binary() }
            , {'barcodes', list(binary()) }
            , {'description', binary() }
            , {'manufacturerCountries', list(binary()) }
            , {'weightDimensions', ympa_erlang_proper_client_offer_weight_dimensions_dto:ympa_erlang_proper_client_offer_weight_dimensions_dto() }
            , {'vendorCode', binary() }
            , {'tags', list(binary()) }
            , {'shelfLife', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
            , {'lifeTime', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
            , {'guaranteePeriod', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
            , {'customsCommodityCode', binary() }
            , {'certificates', list(binary()) }
            , {'boxCount', integer() }
            , {'condition', ympa_erlang_proper_client_offer_condition_dto:ympa_erlang_proper_client_offer_condition_dto() }
            , {'type', ympa_erlang_proper_client_offer_type:ympa_erlang_proper_client_offer_type() }
            , {'downloadable', boolean() }
            , {'adult', boolean() }
            , {'age', ympa_erlang_proper_client_age_dto:ympa_erlang_proper_client_age_dto() }
            , {'params', list(ympa_erlang_proper_client_offer_param_dto:ympa_erlang_proper_client_offer_param_dto()) }
            , {'parameterValues', list(ympa_erlang_proper_client_parameter_value_dto:ympa_erlang_proper_client_parameter_value_dto()) }
            , {'basicPrice', ympa_erlang_proper_client_update_price_with_discount_dto:ympa_erlang_proper_client_update_price_with_discount_dto() }
            , {'purchasePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'additionalExpenses', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'cofinancePrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

