-module(ympa_erlang_client_business_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_business_dto/0]).

-type ympa_erlang_client_business_dto() ::
    #{ 'id' => integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
