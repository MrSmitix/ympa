-module(ympa_erlang_client_get_categories_max_sale_quantum_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_categories_max_sale_quantum_dto/0]).

-type ympa_erlang_client_get_categories_max_sale_quantum_dto() ::
    #{ 'results' := list(),
       'errors' => list()
     }.

encode(#{ 'results' := Results,
          'errors' := Errors
        }) ->
    #{ 'results' => Results,
       'errors' => Errors
     }.
