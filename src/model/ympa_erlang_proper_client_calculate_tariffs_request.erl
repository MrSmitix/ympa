-module(ympa_erlang_proper_client_calculate_tariffs_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculate_tariffs_request/0]).

-export([ympa_erlang_proper_client_calculate_tariffs_request/1]).

-export_type([ympa_erlang_proper_client_calculate_tariffs_request/0]).

-type ympa_erlang_proper_client_calculate_tariffs_request() ::
  [ {'parameters', ympa_erlang_proper_client_calculate_tariffs_parameters_dto:ympa_erlang_proper_client_calculate_tariffs_parameters_dto() }
  | {'offers', list(ympa_erlang_proper_client_calculate_tariffs_offer_dto:ympa_erlang_proper_client_calculate_tariffs_offer_dto()) }
  ].


ympa_erlang_proper_client_calculate_tariffs_request() ->
    ympa_erlang_proper_client_calculate_tariffs_request([]).

ympa_erlang_proper_client_calculate_tariffs_request(Fields) ->
  Default = [ {'parameters', ympa_erlang_proper_client_calculate_tariffs_parameters_dto:ympa_erlang_proper_client_calculate_tariffs_parameters_dto() }
            , {'offers', list(ympa_erlang_proper_client_calculate_tariffs_offer_dto:ympa_erlang_proper_client_calculate_tariffs_offer_dto(), 1, 200) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

