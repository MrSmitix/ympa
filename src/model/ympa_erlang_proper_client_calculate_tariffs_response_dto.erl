-module(ympa_erlang_proper_client_calculate_tariffs_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculate_tariffs_response_dto/0]).

-export([ympa_erlang_proper_client_calculate_tariffs_response_dto/1]).

-export_type([ympa_erlang_proper_client_calculate_tariffs_response_dto/0]).

-type ympa_erlang_proper_client_calculate_tariffs_response_dto() ::
  [ {'offers', list(ympa_erlang_proper_client_calculate_tariffs_offer_info_dto:ympa_erlang_proper_client_calculate_tariffs_offer_info_dto()) }
  ].


ympa_erlang_proper_client_calculate_tariffs_response_dto() ->
    ympa_erlang_proper_client_calculate_tariffs_response_dto([]).

ympa_erlang_proper_client_calculate_tariffs_response_dto(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_calculate_tariffs_offer_info_dto:ympa_erlang_proper_client_calculate_tariffs_offer_info_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

