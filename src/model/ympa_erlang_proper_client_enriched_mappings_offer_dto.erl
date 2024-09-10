-module(ympa_erlang_proper_client_enriched_mappings_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_enriched_mappings_offer_dto/0]).

-export([ympa_erlang_proper_client_enriched_mappings_offer_dto/1]).

-export_type([ympa_erlang_proper_client_enriched_mappings_offer_dto/0]).

-type ympa_erlang_proper_client_enriched_mappings_offer_dto() ::
  [ {'name', binary() }
  | {'shopSku', binary() }
  | {'category', binary() }
  | {'vendor', binary() }
  | {'vendorCode', binary() }
  | {'description', binary() }
  | {'id', binary() }
  | {'feedId', integer() }
  | {'barcodes', list(binary()) }
  | {'urls', list(binary()) }
  | {'pictures', list(binary()) }
  | {'manufacturer', binary() }
  | {'manufacturerCountries', list(binary()) }
  | {'minShipment', integer() }
  | {'transportUnitSize', integer() }
  | {'quantumOfSupply', integer() }
  | {'deliveryDurationDays', integer() }
  | {'boxCount', integer() }
  | {'customsCommodityCodes', list(binary()) }
  | {'weightDimensions', ympa_erlang_proper_client_offer_weight_dimensions_dto:ympa_erlang_proper_client_offer_weight_dimensions_dto() }
  | {'supplyScheduleDays', list(ympa_erlang_proper_client_day_of_week_type:ympa_erlang_proper_client_day_of_week_type()) }
  | {'shelfLifeDays', integer() }
  | {'lifeTimeDays', integer() }
  | {'guaranteePeriodDays', integer() }
  | {'processingState', ympa_erlang_proper_client_offer_processing_state_dto:ympa_erlang_proper_client_offer_processing_state_dto() }
  | {'availability', ympa_erlang_proper_client_offer_availability_status_type:ympa_erlang_proper_client_offer_availability_status_type() }
  | {'shelfLife', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
  | {'lifeTime', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
  | {'guaranteePeriod', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
  | {'certificate', binary() }
  | {'price', integer() }
  | {'marketCategoryId', integer() }
  | {'marketCategoryName', binary() }
  | {'marketModelId', integer() }
  | {'marketModelName', binary() }
  | {'marketSku', integer() }
  | {'marketSkuName', binary() }
  ].


ympa_erlang_proper_client_enriched_mappings_offer_dto() ->
    ympa_erlang_proper_client_enriched_mappings_offer_dto([]).

ympa_erlang_proper_client_enriched_mappings_offer_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'shopSku', binary(1, 255) }
            , {'category', binary() }
            , {'vendor', binary() }
            , {'vendorCode', binary() }
            , {'description', binary() }
            , {'id', binary(1, 255) }
            , {'feedId', integer() }
            , {'barcodes', list(binary()) }
            , {'urls', list(binary()) }
            , {'pictures', list(binary()) }
            , {'manufacturer', binary() }
            , {'manufacturerCountries', list(binary()) }
            , {'minShipment', integer() }
            , {'transportUnitSize', integer() }
            , {'quantumOfSupply', integer() }
            , {'deliveryDurationDays', integer() }
            , {'boxCount', integer() }
            , {'customsCommodityCodes', list(binary()) }
            , {'weightDimensions', ympa_erlang_proper_client_offer_weight_dimensions_dto:ympa_erlang_proper_client_offer_weight_dimensions_dto() }
            , {'supplyScheduleDays', list(ympa_erlang_proper_client_day_of_week_type:ympa_erlang_proper_client_day_of_week_type()) }
            , {'shelfLifeDays', integer() }
            , {'lifeTimeDays', integer() }
            , {'guaranteePeriodDays', integer() }
            , {'processingState', ympa_erlang_proper_client_offer_processing_state_dto:ympa_erlang_proper_client_offer_processing_state_dto() }
            , {'availability', ympa_erlang_proper_client_offer_availability_status_type:ympa_erlang_proper_client_offer_availability_status_type() }
            , {'shelfLife', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
            , {'lifeTime', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
            , {'guaranteePeriod', ympa_erlang_proper_client_time_period_dto:ympa_erlang_proper_client_time_period_dto() }
            , {'certificate', binary() }
            , {'price', integer() }
            , {'marketCategoryId', integer() }
            , {'marketCategoryName', binary() }
            , {'marketModelId', integer() }
            , {'marketModelName', binary() }
            , {'marketSku', integer() }
            , {'marketSkuName', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

