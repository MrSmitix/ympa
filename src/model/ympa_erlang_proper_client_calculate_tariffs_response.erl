-module(ympa_erlang_proper_client_calculate_tariffs_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculate_tariffs_response/0]).

-export([ympa_erlang_proper_client_calculate_tariffs_response/1]).

-export_type([ympa_erlang_proper_client_calculate_tariffs_response/0]).

-type ympa_erlang_proper_client_calculate_tariffs_response() ::
  [ {'status', ympa_erlang_proper_client_api_response_status_type:ympa_erlang_proper_client_api_response_status_type() }
  | {'result', ympa_erlang_proper_client_calculate_tariffs_response_dto:ympa_erlang_proper_client_calculate_tariffs_response_dto() }
  ].


ympa_erlang_proper_client_calculate_tariffs_response() ->
    ympa_erlang_proper_client_calculate_tariffs_response([]).

ympa_erlang_proper_client_calculate_tariffs_response(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_api_response_status_type:ympa_erlang_proper_client_api_response_status_type() }
            , {'result', ympa_erlang_proper_client_calculate_tariffs_response_dto:ympa_erlang_proper_client_calculate_tariffs_response_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

