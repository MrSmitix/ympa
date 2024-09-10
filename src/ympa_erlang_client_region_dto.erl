-module(ympa_erlang_client_region_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_region_dto/0]).

-type ympa_erlang_client_region_dto() ::
    #{ 'id' => integer(),
       'name' := binary(),
       'type' := ympa_erlang_client_region_type:ympa_erlang_client_region_type(),
       'parent' => ympa_erlang_client_region_dto:ympa_erlang_client_region_dto(),
       'children' => list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'type' := Type,
          'parent' := Parent,
          'children' := Children
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'type' => Type,
       'parent' => Parent,
       'children' => Children
     }.
