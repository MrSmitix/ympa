-module(ympa_erlang_client_category_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_category_dto/0]).

-type ympa_erlang_client_category_dto() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'children' => list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'children' := Children
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'children' => Children
     }.
