-module(ympa_erlang_proper_client_get_categories_max_sale_quantum_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_categories_max_sale_quantum_request/0]).

-export([ympa_erlang_proper_client_get_categories_max_sale_quantum_request/1]).

-export_type([ympa_erlang_proper_client_get_categories_max_sale_quantum_request/0]).

-type ympa_erlang_proper_client_get_categories_max_sale_quantum_request() ::
  [ {'marketCategoryIds', list(integer()) }
  ].


ympa_erlang_proper_client_get_categories_max_sale_quantum_request() ->
    ympa_erlang_proper_client_get_categories_max_sale_quantum_request([]).

ympa_erlang_proper_client_get_categories_max_sale_quantum_request(Fields) ->
  Default = [ {'marketCategoryIds', list(integer(), 1, 1500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

