-module(ympa_erlang_client_get_categories_max_sale_quantum_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_categories_max_sale_quantum_response/0]).

-type ympa_erlang_client_get_categories_max_sale_quantum_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'results' := list(),
       'errors' => list()
     }.

encode(#{ 'status' := Status,
          'results' := Results,
          'errors' := Errors
        }) ->
    #{ 'status' => Status,
       'results' => Results,
       'errors' => Errors
     }.
