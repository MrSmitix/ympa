-module(ympa_erlang_client_unit_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_unit_dto/0]).

-type ympa_erlang_client_unit_dto() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'fullName' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'fullName' := FullName
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'fullName' => FullName
     }.
