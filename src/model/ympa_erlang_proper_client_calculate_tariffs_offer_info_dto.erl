-module(ympa_erlang_proper_client_calculate_tariffs_offer_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculate_tariffs_offer_info_dto/0]).

-export([ympa_erlang_proper_client_calculate_tariffs_offer_info_dto/1]).

-export_type([ympa_erlang_proper_client_calculate_tariffs_offer_info_dto/0]).

-type ympa_erlang_proper_client_calculate_tariffs_offer_info_dto() ::
  [ {'offer', ympa_erlang_proper_client_calculate_tariffs_offer_dto:ympa_erlang_proper_client_calculate_tariffs_offer_dto() }
  | {'tariffs', list(ympa_erlang_proper_client_calculated_tariff_dto:ympa_erlang_proper_client_calculated_tariff_dto()) }
  ].


ympa_erlang_proper_client_calculate_tariffs_offer_info_dto() ->
    ympa_erlang_proper_client_calculate_tariffs_offer_info_dto([]).

ympa_erlang_proper_client_calculate_tariffs_offer_info_dto(Fields) ->
  Default = [ {'offer', ympa_erlang_proper_client_calculate_tariffs_offer_dto:ympa_erlang_proper_client_calculate_tariffs_offer_dto() }
            , {'tariffs', list(ympa_erlang_proper_client_calculated_tariff_dto:ympa_erlang_proper_client_calculated_tariff_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

