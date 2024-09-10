-module(ympa_erlang_client_category_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_category_error_dto/0]).

-type ympa_erlang_client_category_error_dto() ::
    #{ 'categoryId' => integer(),
       'type' => ympa_erlang_client_category_error_type:ympa_erlang_client_category_error_type()
     }.

encode(#{ 'categoryId' := CategoryId,
          'type' := Type
        }) ->
    #{ 'categoryId' => CategoryId,
       'type' => Type
     }.
