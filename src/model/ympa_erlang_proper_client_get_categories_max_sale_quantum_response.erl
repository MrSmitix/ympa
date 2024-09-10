-module(ympa_erlang_proper_client_get_categories_max_sale_quantum_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_categories_max_sale_quantum_response/0]).

-export([ympa_erlang_proper_client_get_categories_max_sale_quantum_response/1]).

-export_type([ympa_erlang_proper_client_get_categories_max_sale_quantum_response/0]).

-type ympa_erlang_proper_client_get_categories_max_sale_quantum_response() ::
  [ {'status', ympa_erlang_proper_client_api_response_status_type:ympa_erlang_proper_client_api_response_status_type() }
  | {'results', list(ympa_erlang_proper_client_max_sale_quantum_dto:ympa_erlang_proper_client_max_sale_quantum_dto()) }
  | {'errors', list(ympa_erlang_proper_client_category_error_dto:ympa_erlang_proper_client_category_error_dto()) }
  ].


ympa_erlang_proper_client_get_categories_max_sale_quantum_response() ->
    ympa_erlang_proper_client_get_categories_max_sale_quantum_response([]).

ympa_erlang_proper_client_get_categories_max_sale_quantum_response(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_api_response_status_type:ympa_erlang_proper_client_api_response_status_type() }
            , {'results', list(ympa_erlang_proper_client_max_sale_quantum_dto:ympa_erlang_proper_client_max_sale_quantum_dto()) }
            , {'errors', list(ympa_erlang_proper_client_category_error_dto:ympa_erlang_proper_client_category_error_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

