-module(ympa_erlang_client_category_content_parameters_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_category_content_parameters_dto/0]).

-type ympa_erlang_client_category_content_parameters_dto() ::
    #{ 'categoryId' := integer(),
       'parameters' => list()
     }.

encode(#{ 'categoryId' := CategoryId,
          'parameters' := Parameters
        }) ->
    #{ 'categoryId' => CategoryId,
       'parameters' => Parameters
     }.
